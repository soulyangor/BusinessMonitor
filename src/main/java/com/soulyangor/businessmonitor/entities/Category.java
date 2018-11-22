package com.soulyangor.businessmonitor.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@EqualsAndHashCode(exclude = "rootCategory")
@ToString
@Entity
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String treePath;

    @ManyToOne
    private Category parentCategory;
    
    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
        this.treePath = parentCategory.treePath + "." + name;
    }

}
