package com.yash.dev.dao;

import com.yash.dev.entity.Instructor;
import com.yash.dev.entity.InstructorDetail;

/**
 * @author yashwanthanands
 */
public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailsById(int theId);
}
