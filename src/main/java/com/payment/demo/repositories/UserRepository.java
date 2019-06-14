package com.payment.demo.repositories;

import com.payment.demo.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

  public Optional<Users> findByUsernameAndPassword(String username,String password);




}
