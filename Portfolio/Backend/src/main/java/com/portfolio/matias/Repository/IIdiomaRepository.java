package com.portfolio.matias.Repository;

import com.portfolio.matias.Entity.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIdiomaRepository extends JpaRepository<Idioma,Long>{
    
}
