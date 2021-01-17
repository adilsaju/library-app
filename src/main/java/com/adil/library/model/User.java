package com.adil.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import antlr.collections.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Date registeredDate;

    private int current_kept_book_count;

    private int total_rented_book_count;

    // private int total_fine_recieved;

    // private int total_fine_paid;

    // private List<Integer> booksTotalRented;

    // private List<Integer> booksTotalSubmitted;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
