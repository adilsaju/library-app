package com.adil.library.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
public class Book {

    @Id @GeneratedValue
    private int bid;
    private String bname;
    //foreign key
    // private int authid;

    // private Author author;
    private String btype;
    //actually a blob
    private String bfileName;

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
    // public Author getAuthor() {
    //     return author;
    // }

    // /**
    //  * @param author the author to set
    //  */
    // public void setAuthor(Author author) {
    //     this.author = author;
    // }

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
        // "author=" + author + 
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
