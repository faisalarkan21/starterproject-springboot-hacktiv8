package com.example.securingweb.DAO;


import com.example.securingweb.Entity.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface roleDAO extends JpaRepository<role,String> {
    @Query(nativeQuery = true,value="SELECT r.* FROM role r WHERE r.role like %:role% ")
    role findIdByRole(@Param("role") String role);
}
