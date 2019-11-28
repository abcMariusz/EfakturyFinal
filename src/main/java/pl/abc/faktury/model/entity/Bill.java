package pl.abc.faktury.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter

@Setter
public class Bill implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nrFakt;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPrice(String newPrice) {
        this.price = newPrice;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }

    private String customerName;
    private String price;
    private Date date;

    @ManyToOne
    @JoinColumn()
    private User user;

    @ManyToOne
    @JoinColumn()
    private Customer customer;



    public Long getId() {
        return id;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getNrFakt() {
        return nrFakt;
    }

    public Date getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }


}
