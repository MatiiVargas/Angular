package com.portfolio.matias.Repository;

import com.portfolio.matias.Entity.Descripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDescripcionRepository extends JpaRepository<Descripcion,Long>{
    
}
