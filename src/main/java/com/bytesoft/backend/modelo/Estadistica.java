package com.bytesoft.backend.modelo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;
import java.lang.String;

@Entity
public class Estadistica {
    @Id
    private String id = UUID.randomUUID().toString();
    private String ChartName;
//    private List<String> xAxis;
//    private List<Long> yAxis;

    public Estadistica(){

    }

    public Estadistica(String id, String chartName, String secondChart, int aa){// List<String> xAxis, List<Long> yAxis) {
        this.id = id;
        this.ChartName = chartName;
//        this.xAxis = xAxis;
//        this.yAxis = yAxis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChartName() {
        return ChartName;
    }

    public void setChartName(String chartName) {
        ChartName = chartName;
    }

//    public List<String> getxAxis() {
//        return xAxis;
//    }
//
//    public void setxAxis(List<String> xAxis) {
//        this.xAxis = xAxis;
//    }
//
//    public List<Long> getyAxis() {
//        return yAxis;
//    }
//
//    public void setyAxis(List<Long> yAxis) {
//        this.yAxis = yAxis;
//    }
}
