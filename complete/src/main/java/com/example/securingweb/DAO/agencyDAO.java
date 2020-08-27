package com.example.securingweb.DAO;


import com.example.securingweb.Entity.agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface agencyDAO extends JpaRepository<agency,String> {

}