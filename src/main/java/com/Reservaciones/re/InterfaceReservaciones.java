/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reservaciones.re;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC
 */
public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer> {
    public List<Reservaciones> findAllByStatus (String status);
    
    public List<Reservaciones> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);

    //select clientid, count(*) as "total" from reservacion group by clientid order by total desc; 
    @Query("SELECT c.client, COUNT(c.client) FROM Reservaciones AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationByClient();

}
