package com.testbed.orcchaser.repository;

import com.testbed.orcchaser.domain.user.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {
    private EntityManager em;

    public Long register(User user) {
        em.persist(user);

        return user.getId();
    }
}
