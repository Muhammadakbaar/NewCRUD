package com.LLBCorp.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="sekolah")
public class Sekolah {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long nomorSekolah;

    private String namaSekolah;

    public Long getNomorSekolah() {
        return nomorSekolah;
    }
    public void setNomorSekolah(Long nomorSekolah){
        this.nomorSekolah = nomorSekolah;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }
    public void setNamaSekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }
}