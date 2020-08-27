package com.example.securingweb.DAO;


import com.example.securingweb.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface userDAO extends JpaRepository<user,String> {
    @Query("SELECT u FROM user u WHERE u.email = :email")
    public user getUserByemail(@Param("email") String email);
}