package com.terrakios.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.terrakios.os.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer>{

}
