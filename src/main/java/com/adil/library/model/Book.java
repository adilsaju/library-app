package com.adil.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.lang.NonNull;

@Entity
public class Book {

    @Id @GeneratedValue
    private int bid;
    @NonNull
    private String bname;
    //foreign key
    // private int authid;
    @ManyToOne()
    private Author author;
    private String btype;
    //actually a blob
    private String bfileName;

    private Date lastUserRentedDate;

    @ManyToOne(targetEntity = User.class)
    private User user_rented;

    /**
     * @return the bname
     */
    public String getBname() {
        return bname;
    }

    /**
     * @param bname the bname to set
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * @return the btype
     */
    public String getBtype() {
        return btype;
    }

    /**
     * @param btype the btype to set
     */
    public void setBtype(String btype) {
        this.btype = btype;
    }

    /**
     * @return the bfileName
     */
    public String getBfileName() {
        return bfileName;
    }

    /**
     * @param bfileName the bfileName to set
     */
    public void setBfileName(String bfileName) {
        this.bfileName = bfileName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Book ["+
        "author=" + author + 
        ", bfileName=" + bfileName + ", bid=" + bid + ", bname=" + bname + ", btype="
                + btype + "]";
    }

    /**
     * @param bid
     * @param bname
     */
    public Book(int bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

    /**
     * 
     */
    public Book() {
    }
}
