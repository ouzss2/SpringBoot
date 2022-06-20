package com.Ouzss.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ouzss.UserEntity.User;




@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
