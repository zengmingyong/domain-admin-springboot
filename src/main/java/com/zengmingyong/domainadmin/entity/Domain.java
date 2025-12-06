package com.zengmingyong.domainadmin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String owner;
    private String status;
    private String description;
}