package com.adil.library.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {

    @Id @GeneratedValue
    private int aid;
    private String aname;
    //foreign key
    // private int bid;
    private String atype;

    /**
     * @return the aname
     */
    public String getAname() {
        return aname;
    }

    /**
     * @param aname the aname to set
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * @return the atype
     */
    public String getAtype() {
        return atype;
    }

    /**
     * @param atype the atype to set
     */
    public void setAtype(String atype) {
        this.atype = atype;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Author [aid=" + aid + ", aname=" + aname + ", atype=" + atype + "]";
    }
}
