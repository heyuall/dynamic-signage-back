package com.pfe.dynamicsignage.dao;

import com.pfe.dynamicsignage.entity.MessageComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageComponentDao extends JpaRepository<MessageComponent, Integer> {

}
