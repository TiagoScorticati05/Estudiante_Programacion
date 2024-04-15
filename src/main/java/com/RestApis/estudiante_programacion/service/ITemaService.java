package com.RestApis.estudiante_programacion.service;
import com.RestApis.estudiante_programacion.model.Tema;
import java.util.List;

public interface ITemaService {
    
    
    public List<Tema> getTemas();

  
    public void saveTema(Tema tema);

   
    public void deleteTema(Long id);

    
    public Tema findTema(Long id);

       public void editTema(Tema tema);
    
    
}
