package com.bytesoft.backend.servicio;

import com.bytesoft.backend.modelo.ChartPoints;
import com.bytesoft.backend.repositorio.StatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioEstadistica {

    @Autowired
    private StatsRepo statsRepo;

    public List<ChartPoints> masDiagnosticadas(){
        return statsRepo.masDiagnosticadas();
    }
    public List<ChartPoints> someQuery(){
        return statsRepo.someQuery();
    }
    public int usuariosActivos() { return statsRepo.usuariosActivos(); }
}
