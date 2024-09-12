package com.hasan.Dream.Shop.Repository;

import com.hasan.Dream.Shop.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
//    a repository is the communication with database

    public User findByEmail(String email);
}
