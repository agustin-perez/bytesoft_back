package com.bytesoft.backend.controlador;

import com.bytesoft.backend.modelo.ChartPoints;
import com.bytesoft.backend.servicio.ServicioEstadistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/mainstats", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class StatsController {
    @Autowired
    private ServicioEstadistica servicioEstadistica;

    @GetMapping("/charts")
    @CrossOrigin
    public @ResponseBody ArrayList<Map<String, Object>> charts(){
        ArrayList<Map<String, Object>> charts = new ArrayList<>();
        charts.add(getArrayStats("Patologías más diagnosticadas", servicioEstadistica.masDiagnosticadas()));
        charts.add(getArrayStats("Ni idea que es esto", servicioEstadistica.someQuery()));
        return charts;
    }

    @GetMapping("/usersactivos")
    @CrossOrigin
    public @ResponseBody int usersActivos(){
        return servicioEstadistica.usuariosActivos();
    }

    private Map<String, Object> getArrayStats(String title, List<ChartPoints> lista){
        HashMap<String, Object> result = new HashMap<>();
        List<ChartPoints> consultaBD = lista;
        ArrayList<String> xAxis = new ArrayList<>();
        ArrayList<Integer> yAxis = new ArrayList<>();
        for(ChartPoints var : consultaBD){
            xAxis.add(var.getX());
        }
        for(ChartPoints var : consultaBD){
            yAxis.add(var.getY());
        }
        result.put("yAxis", yAxis);
        result.put("xAxis", xAxis);
        result.put("ChartName", title);
        result.put("id", UUID.randomUUID().toString());
        return result;
    }
}