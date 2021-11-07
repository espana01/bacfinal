/**
 * @Autor ALex Yovany España
 * @version 1
 * @Usa
 */

package com.audience.re;

/**
 * importaciones
 */
import com.categoria.re.Categoria;
import com.Mensajes.re.Mensajes;
import com.reservaciones.re.Reservaciones;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Alex España
 */
@Entity
@Table(name = "Audience")
public class Audience  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String owner;
    private Integer capacity;
    private String description;
    /**
     * muchos a uno
     */
    @ManyToOne
    @JoinColumn(name = "categoryid")
    @JsonIgnoreProperties("audiences")
    private Categoria category;
    /**
     * uno a muchos
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "audience")
    @JsonIgnoreProperties({"audience", "client"})
    private List<Mensajes> messages;
    /**
     * uno a muchos
     */
   @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "audience")
    @JsonIgnoreProperties({"audience", "client"})
    private List<Reservaciones> reservations;
/**
 * 
 * @return Id 
 */
    public Integer getId() {
        return id;
    }
/**
 * 
 * @param id 
 */
    public void setId(Integer id) {
        this.id = id;
    }
/**
 * 
 * @return name
 */
    public String getName() {
        return name;
    }
/**
 * 
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * 
 * @return owner
 */
    public String getOwner() {
        return owner;
    }
/**
 * 
 * @param owner 
 */
    public void setOwner(String owner) {
        this.owner = owner;
    }
/**
 * 
 * @return capacity
 */
    public Integer getCapacity() {
        return capacity;
    }
/**
 * 
 * @param capacity 
 */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
/**
 * 
 * @return description
 */
    public String getDescription() {
        return description;
    }
/**
 * 
 * @param description 
 */
    public void setDescription(String description) {
        this.description = description;
    }
/**
 * 
 * @return categoty 
 */
    public Categoria getCategory() {
        return category;
    }
/**
 * 
 * @param category 
 */
    public void setCategory(Categoria category) {
        this.category = category;
    }
/**
 * 
 * @returnmessages 
 */
    public List<Mensajes> getMessages() {
        return messages;
    }
/**
 * 
 * @param messages 
 */
    public void setMessages(List<Mensajes> messages) {
        this.messages = messages;
    }
/**
 * 
 * @return reservations 
 */
    public List<Reservaciones> getReservations() {
        return reservations;
    }
/**
 * 
 * @param reservations 
 */
    public void setReservations(List<Reservaciones> reservations) {
        this.reservations = reservations;
    }
}
