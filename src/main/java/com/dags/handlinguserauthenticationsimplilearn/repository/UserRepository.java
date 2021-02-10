package com.dags.handlinguserauthenticationsimplilearn.repository;

import com.dags.handlinguserauthenticationsimplilearn.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsernameAndPassword(String username, String password);
}
