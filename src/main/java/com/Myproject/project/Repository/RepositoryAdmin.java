package com.Myproject.project.Repository;

import com.Myproject.project.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAdmin extends JpaRepository<Admin,Integer> {
}
