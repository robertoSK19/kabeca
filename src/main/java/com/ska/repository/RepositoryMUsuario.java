package com.ska.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ska.entity.MUsuario;
@Repository
public interface RepositoryMUsuario extends JpaRepository<MUsuario, Long>{

}
