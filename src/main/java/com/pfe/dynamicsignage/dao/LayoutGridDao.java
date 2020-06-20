package com.pfe.dynamicsignage.dao;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LayoutGridDao extends JpaRepository<LayoutGrid, Long> {
    boolean existsByName(String name);

    LayoutGrid findByName(String name);
}
