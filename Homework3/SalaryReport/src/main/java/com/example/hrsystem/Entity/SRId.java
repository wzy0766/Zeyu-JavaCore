package com.example.hrsystem.Entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SRId implements Serializable {
    public String job;
    public String department;

}
