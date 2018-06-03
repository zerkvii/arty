package com.example.arty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//    User findUserByUsernameOrEmailOrCellphone(String username,String email,String cellphone);
    User findUserByUsername(String username);
    User findUserByEmail(String email);
    User findUserByCellphone(String cellphone);
}
