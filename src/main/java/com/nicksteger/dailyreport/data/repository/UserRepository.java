package com.nicksteger.dailyreport.data.repository;

import com.nicksteger.dailyreport.data.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User findByID(long id);

    User findByEmail(String email);

}
