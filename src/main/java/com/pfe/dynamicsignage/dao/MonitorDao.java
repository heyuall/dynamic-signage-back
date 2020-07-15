package com.pfe.dynamicsignage.dao;

import com.pfe.dynamicsignage.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorDao extends JpaRepository<Monitor,Long> {
    boolean existsByName(String name);

    Monitor findByName(String name);
}
