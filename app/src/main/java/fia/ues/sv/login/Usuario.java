package fia.ues.sv.login;

public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String clave;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombreUsuario, String clave) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
