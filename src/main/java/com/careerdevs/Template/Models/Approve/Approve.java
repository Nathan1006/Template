package com.careerdevs.Template.Models.Approve;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;

@Entity
public class Approve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
}
