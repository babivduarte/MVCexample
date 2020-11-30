/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author barbara
 */
public class Time {
    private Integer id;
    private String nomeTime;
    private String estadoTime;
    private String cidadeTime;
    private String paisTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getEstadoTime() {
        return estadoTime;
    }

    public void setEstadoTime(String estadoTime) {
        this.estadoTime = estadoTime;
    }

    public String getCidadeTime() {
        return cidadeTime;
    }

    public void setCidadeTime(String cidadeTime) {
        this.cidadeTime = cidadeTime;
    }

    public String getPaisTime() {
        return paisTime;
    }

    public void setPaisTime(String paisTime) {
        this.paisTime = paisTime;
    }
    
    
}
