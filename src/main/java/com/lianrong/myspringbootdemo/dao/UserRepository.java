package com.lianrong.myspringbootdemo.dao;

import com.lianrong.myspringbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUuid(String uuid);
}
