package com.Myproject.project.Repository;

import com.Myproject.project.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPhone extends JpaRepository<Phone,Integer> {
}
