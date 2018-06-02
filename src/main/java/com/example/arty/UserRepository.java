package com.example.arty;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findUserByUsernameOrEmailOrCellphone(String username,String email,String cellphone);
}
