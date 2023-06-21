package com.yash.dev.dao;

import com.yash.dev.entity.Instructor;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yashwanthanands
 */

@Service
public class AppDAOImpl implements AppDAO{


    private EntityManager entityManager;

    public AppDAOImpl(EntityManager enMgr) {
        this.entityManager=enMgr;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }
}
