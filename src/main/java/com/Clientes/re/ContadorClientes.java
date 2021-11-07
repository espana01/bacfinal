/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clientes.re;

/**
 *
 * @author PC
 */
public class ContadorClientes {
    private Long total;
    private Clientes client;

    public ContadorClientes(Long total, Clientes client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Clientes getClient() {
        return client;
    }

    public void setClient(Clientes client) {
        this.client = client;
    }

    
}
