package com.Ejercicio.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true,nullable = false)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String sexo;
    private Integer dni;
    public void SetNombre(String nombre){
      this.nombre=nombre;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String GetNombre(){
        return nombre;
    }
    public void SetApellido(String apellido){
        this.apellido=apellido;
    }
    public String GetApellido(){
          return apellido;
    }
    public void SetSexo(String sexo){
        this.sexo=sexo;
    }
    public String GetSexo(){
          return sexo;
    }
    public void  SetDni(Integer dni){
      this.dni=dni;
    }
    public Integer GetDNI(){
        return dni;
  }
}
