
package tarea2;

public class Usuario {

// atributos
    String nombreUsuario;
    String apellidoUsuario;
    String password;

    //constructor
    Usuario(String nombreUsuario, String apellidoUsuario, String password){
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario=apellidoUsuario;
        this.password = password;
    }

    // getters y setters
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }
    public String getApellidoUsuario(){
        return apellidoUsuario;
    }
    public void setApellidoUsuario(String apellidoUsuario){
        this.apellidoUsuario=apellidoUsuario;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }


    
}
