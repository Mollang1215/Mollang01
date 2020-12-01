package com.example.fproject.Repository;


import com.example.fproject.Entity.User_listEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User_listEntity, Long> {


}
