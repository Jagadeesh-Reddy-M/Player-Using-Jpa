package com.example.player.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.player.model.Player;

@Repository
public interface PlayerJpaRepository extends JpaRepository<Player , Integer>{

}