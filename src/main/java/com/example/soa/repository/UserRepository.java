package com.example.soa.repository;

import com.example.soa.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
