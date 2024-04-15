
package com.RestApis.estudiante_programacion.repository;

import com.RestApis.estudiante_programacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long>{
    
}
