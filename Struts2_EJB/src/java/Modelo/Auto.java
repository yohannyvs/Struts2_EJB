/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mneakira00
 */
@Entity
@Table(name = "auto", catalog = "CR_Autos", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auto.findAll", query = "SELECT a FROM Auto a")
    , @NamedQuery(name = "Auto.findById", query = "SELECT a FROM Auto a WHERE a.id = :id")
    , @NamedQuery(name = "Auto.findByPlaca", query = "SELECT a FROM Auto a WHERE a.placa = :placa")
    , @NamedQuery(name = "Auto.findByModelo", query = "SELECT a FROM Auto a WHERE a.modelo = :modelo")
    , @NamedQuery(name = "Auto.findByCombustible", query = "SELECT a FROM Auto a WHERE a.combustible = :combustible")
    , @NamedQuery(name = "Auto.findByTransmision", query = "SELECT a FROM Auto a WHERE a.transmision = :transmision")
    , @NamedQuery(name = "Auto.findByEstado", query = "SELECT a FROM Auto a WHERE a.estado = :estado")
    , @NamedQuery(name = "Auto.findByKilometraje", query = "SELECT a FROM Auto a WHERE a.kilometraje = :kilometraje")
    , @NamedQuery(name = "Auto.findByNPuertas", query = "SELECT a FROM Auto a WHERE a.nPuertas = :nPuertas")
    , @NamedQuery(name = "Auto.findByColor", query = "SELECT a FROM Auto a WHERE a.color = :color")
    , @NamedQuery(name = "Auto.findByPrecio", query = "SELECT a FROM Auto a WHERE a.precio = :precio")
    , @NamedQuery(name = "Auto.findByAnio", query = "SELECT a FROM Auto a WHERE a.anio = :anio")
    , @NamedQuery(name = "Auto.findByProvincia", query = "SELECT a FROM Auto a WHERE a.provincia = :provincia")})
public class Auto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "combustible")
    private String combustible;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "transmision")
    private String transmision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kilometraje")
    private Integer kilometraje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "n_puertas")
    private Integer nPuertas;
    @Basic(optional = false)
    @NotNull
    @Size(max = 20)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private Integer precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private Integer anio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "provincia")
    private String provincia;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Auto() {
    }

    public Auto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Integer getNPuertas() {
        return nPuertas;
    }

    public void setNPuertas(Integer nPuertas) {
        this.nPuertas = nPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auto)) {
            return false;
        }
        Auto other = (Auto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Auto[ id=" + id + " ]";
    }
    
}
