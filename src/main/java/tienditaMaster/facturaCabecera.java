// aaron estrada
package tienditaMaster;

public class facturaCabecera extends cliente {
    private int folioFactura;
    private int fechafactura;

    public facturaCabecera(int folioFactura, int fechafactura, int idCliente, int fechaRegristro, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais) {
        super(idCliente, fechaRegristro, nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
        this.folioFactura = folioFactura;
        this.fechafactura = fechafactura;
    }
    public int getFechaPedido() {
        return folioFactura;
    }

    public int getFechafactura() {
        return fechafactura;
    }
    @Override
    public void mostrarDatos(){
    System.out.println("del folio de la factura es->"+getFechaPedido
        ()+"la fecha de la factura es->"+getFechafactura());
    } 
}
