package com.soulyangor.businessmonitor.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Sokolov Slava
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"product", "deliveryOrder"})
@Entity
public class Procurement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int amount;

    private BigDecimal price;

    @ManyToOne
    private Product product;

    @ManyToOne
    private DeliveryOrder deliveryOrder;

    public BigDecimal getCost() {
        return price.multiply(new BigDecimal(amount));
    }

}
