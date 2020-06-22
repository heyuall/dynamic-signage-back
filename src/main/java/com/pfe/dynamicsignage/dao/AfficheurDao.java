package com.pfe.dynamicsignage.dao;

import com.pfe.dynamicsignage.Entity.Afficheur;
import com.pfe.dynamicsignage.Entity.LayoutGrid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfficheurDao extends JpaRepository<Afficheur,Long> {
    boolean existsByName(String name);

    Afficheur findByName(String name);
}