package com.payment.demo.entities;




import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;



    private String firstname;
    private String lastname;
    @CreatedDate
    private Date createdon;
    private String email;
    @Size(max=50)
    @Size(min=10)
    private String username;
    private String password;

    public Users() {
    }

    public long getId() {
        return id;
    }

    public Users setId(long id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Users setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Users setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public Users setCreatedon(Date createdon) {
        this.createdon = createdon;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Users setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Users setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Users setPassword(String password) {
        this.password = password;
        return this;
    }
}
