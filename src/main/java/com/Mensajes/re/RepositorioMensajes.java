/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Mensajes.re;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public class RepositorioMensajes {

    @Autowired
    private InterfaceMensajes crud3;

    public List<Mensajes> getAll() {
        return (List<Mensajes>) crud3.findAll();
    }

    public Optional<Mensajes> getMessage(int id) {
        return crud3.findById(id);
    }

    public Mensajes save(Mensajes message) {
        return crud3.save(message);
    }

    public void delete(Mensajes message) {
        crud3.delete(message);
    }
}
