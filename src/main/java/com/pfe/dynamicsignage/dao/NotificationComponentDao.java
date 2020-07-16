package com.pfe.dynamicsignage.dao;



import com.pfe.dynamicsignage.entity.NotificationComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationComponentDao  extends JpaRepository<NotificationComponent,Long> {
}
