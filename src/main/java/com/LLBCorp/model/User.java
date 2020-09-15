package com.LLBCorp.model;

import com.LLBCorp.model.Sekolah;
import javax.persistence.Entity;
import javax.persistence.Table  ;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="users")
public class User {

    @ManyToOne(optional=false)
    @JoinColumn(name = "nomorSekolah", referencedColumnName="nomorSekolah", insertable = false, updatable = false)
    private Sekolah sekolah;

    private Long nomorSekolah;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Sekolah getSekolah() {
        return sekolah;
    }

    public void setSekolah(Sekolah sekolah) {
        this.sekolah = sekolah;
    }

    private String name;

    private String email;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public Long getNomorSekolah() {
        return nomorSekolah;
    }

    public void setNomorSekolah(Long nomorSekolah) {
        this.nomorSekolah = nomorSekolah;
    }

    public void setEmail(String email){
        this.email = email;
    }
}