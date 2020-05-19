import com.dh.dao.StudentMapper;
import com.dh.dao.TeacherMapper;
import com.dh.pojo.Student;
import com.dh.pojo.Teacher;
import com.dh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        Teacher teacher = mapper.getTeacher();
//        System.out.println(teacher);

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
