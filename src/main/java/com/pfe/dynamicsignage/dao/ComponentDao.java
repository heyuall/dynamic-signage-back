package com.pfe.dynamicsignage.dao;


import com.pfe.dynamicsignage.entity.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentDao extends JpaRepository<Component,Long> {

}
