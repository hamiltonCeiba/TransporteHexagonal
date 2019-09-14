package com.ceiba.adaptador.repositorio;

import com.ceiba.adaptador.repositorio.dao.entidad.TonelajeEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TonelajeRepositoryJPA extends JpaRepository<TonelajeEntidad,Long> {
}
