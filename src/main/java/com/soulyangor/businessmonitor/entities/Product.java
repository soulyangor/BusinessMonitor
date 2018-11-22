package com.soulyangor.businessmonitor.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Sokolov Slava
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"producer", "category", "properties"})
@ToString
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String dimension;

    private String description;

    private int amount;

    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Category category;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "products_properties",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "property_id"))
    private Set<Property> properties;

    public Product addProperty(Property property) {
        this.properties.add(property);
        return this;
    }

    public Product removeProperty(Property property) {
        this.properties.remove(property);
        return this;
    }

}
