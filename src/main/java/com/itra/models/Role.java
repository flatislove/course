package com.itra.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // The user's name
    @NotNull
    private String name;

    public Role(){};
    public Role(long id,String name){
        this.id=id;
        this.name=name;

    }

}
