import com.dh.dao.BlogMapper;
import com.dh.pojo.Blog;
import com.dh.util.IDutils;
import com.dh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("邓浩说");
        blog.setAuthor("邓浩");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addBook(blog);

        blog.setTitle("网站说");
        blog.setAuthor("网站");
        mapper.addBook(blog);

        blog.setTitle("样子说");
        blog.setAuthor("样子");
        mapper.addBook(blog);

        blog.setTitle("垃圾");
        blog.setAuthor("垃圾");
        mapper.addBook(blog);

        sqlSession.close();
    }
    @Test
    public void Test(){
        System.out.println(IDutils.getId());
    }
    @Test
    public void queryBlog(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        List<Blog> blogList = mapper.queryBlogIF(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
