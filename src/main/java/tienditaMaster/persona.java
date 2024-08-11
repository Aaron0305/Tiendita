// aaron estrada
package tienditaMaster;

public class persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String curp;
    private int telefono;
    private int calleNo;
    private String colonia;
    private String ciudad;
    private String pais;
    
    public persona(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.curp = curp;
        this.telefono = telefono;
        this.calleNo = calleNo;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getCurp() {
        return curp;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCalleNo() {
        return calleNo;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
    
}


