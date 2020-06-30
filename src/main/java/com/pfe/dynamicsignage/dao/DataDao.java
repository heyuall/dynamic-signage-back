package com.pfe.dynamicsignage.dao;

import com.pfe.dynamicsignage.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDao extends JpaRepository<Data,Long> {
}
