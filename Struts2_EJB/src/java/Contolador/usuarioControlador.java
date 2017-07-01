package Contolador;

import Modelo.Usuario;
import EJB.UsuarioFacade;
import com.opensymphony.xwork2.ActionSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;

public class usuarioControlador extends ActionSupport
{
    
    UsuarioFacade usuarioFacade = lookupUsuarioFacadeBean();
    
    private List<Usuario> lista;
    private Usuario usuarios;
    private int id;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Telefono;
    private String Direccion;
    private String Apodo;
    private String Pass;

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    @Override
    public String execute()
    {
        return SUCCESS;
    }
    
    public String Login()
    {
        return SUCCESS;
    }
    
    public String lista()
    {
        lista= new ArrayList<Usuario>();
        lista = usuarioFacade.findAll();
        setLista(lista);
        
        return SUCCESS;
    }
    
    public String Registrar_Usuario()
    {
        try
        {
            if(getNombre() == null||getNombre().equals(""))
            {
               return SUCCESS; 
            }
        }
        catch(Exception e)
        {
            return SUCCESS;
        }
        
        Usuario u = new Usuario();
        u.setNombre(getNombre());
        u.setApellido(getApellido());
        u.setApodo(getApodo());
        u.setCorreo(getCorreo());
        u.setDireccion(getDireccion());
        u.setPass(getPass());
        u.setTelefono(Integer.parseInt(getTelefono()));
        
        usuarioFacade.create(u);
        
        return "inserto";
    }
    
    public String Editar()
    {
        Usuario u = usuarioFacade.find(getId());
        u.setNombre(getNombre());
        u.setApellido(getApellido());
        u.setApodo(getApodo());
        u.setCorreo(getCorreo());
        u.setDireccion(getDireccion());
        u.setPass(getPass());
        u.setTelefono(Integer.parseInt(getTelefono()));
        
        usuarioFacade.edit(u);
        
        List<Usuario> l = usuarioFacade.findAll();
        setLista(l);
        
        return SUCCESS;
    }
    
    public String Mostrar()
    {
        Usuario u = usuarioFacade.find(getId());
        setUsuarios(u);
        
        return SUCCESS;
    }
    
    public String Eliminar()
    {
        Usuario u = usuarioFacade.find(getId());
        usuarioFacade.remove(u);
        List<Usuario> l = usuarioFacade.findAll();
        setLista(l);
        
        return SUCCESS;
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
