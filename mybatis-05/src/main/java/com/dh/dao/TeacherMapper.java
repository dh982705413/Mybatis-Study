package com.dh.dao;

import com.dh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TeacherMapper {

//    List<Teacher> getTeacher();

//    获取指定老师下所以学生及老师信息
    Teacher getTeacher(@Param("tid") int id);
    Teacher getTeacher2(@Param("tid") int id);
}
