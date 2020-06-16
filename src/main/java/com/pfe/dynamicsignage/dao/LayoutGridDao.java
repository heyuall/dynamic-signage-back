package com.pfe.dynamicsignage.dao;
import com.pfe.dynamicsignage.Entity.LayoutGrid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LayoutGridDao extends CrudRepository<LayoutGrid,Long> {
    boolean existsByname(String name);
    LayoutGrid findByname(String name);
}
