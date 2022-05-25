package com.portfolio.matias.Repository;

import com.portfolio.matias.Entity.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICertificacionRepository extends JpaRepository<Certificacion,Long>{
    
}
