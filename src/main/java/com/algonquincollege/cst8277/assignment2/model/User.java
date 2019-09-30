/**************************************************************G*********o****o****g**o****og**joob*********************
 * File: User.java
 * Course materials (19F) CST 8277
 * @author (original) Mike Norman
 * 
 * @Author: I. M. Student 
 * @Student#: 040123456
 * @modified: 2019/XX/YY
 */
package com.algonquincollege.cst8277.assignment2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@Entity
@Table(name="users")
public class User implements Serializable {
    /** explicit set serialVersionUID */
    private static final long serialVersionUID = 1L;

    protected int id;
    //TODO - other member fields

    // JPA requires the default constructor be present
    public User() {
        super();    
    }

    @Id // JPA will automatically generate the primary key based on IDENTITY column-type
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //TODO - other getters/setters, mappings

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User)obj;
        if (id != other.id)
            return false;
        return true;
    }
}