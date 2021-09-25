package com.org.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.models.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
