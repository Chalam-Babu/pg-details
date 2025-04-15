package com.example.pg.details.repositary;

import com.example.pg.details.model.guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface guestrepo extends JpaRepository<guest, Integer> {

}
