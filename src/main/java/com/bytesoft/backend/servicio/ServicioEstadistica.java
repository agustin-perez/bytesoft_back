package com.bytesoft.backend.servicio;

import com.bytesoft.backend.modelo.Estadistica;
import com.bytesoft.backend.repositorio.RepositorioEstadistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioEstadistica {

    @Autowired
    private RepositorioEstadistica repositorioEstadistica;

    public List<Estadistica> listarEstadisticas(){
        return repositorioEstadistica.findAll();
    }
}
