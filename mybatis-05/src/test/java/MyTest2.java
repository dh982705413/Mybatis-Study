import com.dh.dao.StudentMapper;
import com.dh.dao.TeacherMapper;
import com.dh.pojo.Student;
import com.dh.pojo.Teacher;
import com.dh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest2 {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher1 = mapper.getTeacher2(1);
        System.out.println(teacher1);
        sqlSession.close();
    }
}
