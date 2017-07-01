
package Controlador;

import Modelo.Auto;
import EJB.AutoFacade;
import EJB.UsuarioFacade;
import Modelo.Usuario;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class autoControlador extends ActionSupport
{
    
    AutoFacade autoFacade = lookupAutoFacadeBean();
    UsuarioFacade usuarioFacade = lookupUsuarioFacadeBean();
    
    private List<Auto> lista;
    private Auto autos;
    private int id;
    private String Id_usuario;
    private String Placa;
    private String Modelo;
    private String Combustible;
    private String Transmicion;
    private String Estado;
    private String Kilometraje;
    private String N_puertas;
    private String Color;
    private String Precio;
    private String Anio;
    private String Provincia;

    public List<Auto> getLista() {
        return lista;
    }

    public void setLista(List<Auto> lista) {
        this.lista = lista;
    }

    public Auto getAutos() {
        return autos;
    }

    public void setAutos(Auto autos) {
        this.autos = autos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(String Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getTransmicion() {
        return Transmicion;
    }

    public void setTransmicion(String Transmicion) {
        this.Transmicion = Transmicion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(String Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getN_puertas() {
        return N_puertas;
    }

    public void setN_puertas(String N_puertas) {
        this.N_puertas = N_puertas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    
    @Override
    public String execute()
    {
        return SUCCESS;
    }
    
    public String lista_auto()
    {
        lista = new ArrayList<Auto>();
        lista = autoFacade.findAll();
        setLista(lista);
        
        return SUCCESS;
    }
    
    public String Registrar_Auto()
    {
        System.out.println("ENTROOOOOOOOOOO2222");
        try
        {
            if(getPlaca() == null||getPlaca().equals(""))
            {
               return SUCCESS; 
            }
        }
        catch(Exception e)
        {
            return SUCCESS;
        }
        
        Auto a = new Auto();
        Usuario u = usuarioFacade.find(getId_usuario());
        a.setAnio(Integer.parseInt(getAnio()));
        a.setColor(getColor());
        a.setCombustible(getCombustible());
        a.setEstado(getEstado());
        a.setIdUsuario(u);
        a.setKilometraje(Integer.parseInt(getKilometraje()));
        a.setModelo(getModelo());
        a.setNPuertas(Integer.parseInt(getN_puertas()));
        a.setPlaca(getPlaca());
        a.setPrecio(Integer.parseInt(getPrecio()));
        a.setProvincia(getProvincia());
        a.setTransmision(getTransmicion());
        
        autoFacade.create(a);
        
        return "inserto";
    }
    
    public String Editar()
    {
        Auto a = autoFacade.find(getId());
        Usuario u = usuarioFacade.find(getId_usuario());
        a.setAnio(Integer.parseInt(getAnio()));
        a.setColor(getColor());
        a.setCombustible(getCombustible());
        a.setEstado(getEstado());
        a.setIdUsuario(u);
        a.setKilometraje(Integer.parseInt(getKilometraje()));
        a.setModelo(getModelo());
        a.setNPuertas(Integer.parseInt(getN_puertas()));
        a.setPlaca(getPlaca());
        a.setPrecio(Integer.parseInt(getPrecio()));
        a.setProvincia(getProvincia());
        a.setTransmision(getTransmicion());
        
        autoFacade.edit(a);
        List<Auto> l = autoFacade.findAll();
        setLista(l);
        
        return SUCCESS;
    }
    
    public String Eliminar()
    {
        Auto a = autoFacade.find(getId());
        autoFacade.remove(a);
        List<Auto> l = autoFacade.findAll();
        setLista(l);
        
        return SUCCESS;
    }
    
    public String Mostrar()
    {
        Auto a = autoFacade.find(getId());
        setAutos(a);
        
        return SUCCESS;
    }
    
    
    private AutoFacade lookupAutoFacadeBean() 
    {
        try {
            Context c = new InitialContext();
            return (AutoFacade) c.lookup("java:global/Struts2_EJB/AutoFacade!EJB.AutoFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    private UsuarioFacade lookupUsuarioFacadeBean() 
    {
        try {
            Context c = new InitialContext();
            return (UsuarioFacade) c.lookup("java:global/Struts2_EJB/UsuarioFacade!EJB.UsuarioFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
