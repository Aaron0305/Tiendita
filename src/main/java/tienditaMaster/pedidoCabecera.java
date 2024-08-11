// aaron estrada
package tienditaMaster;

public class pedidoCabecera extends proveedor{
    private int folioPedido;
    private int fechaPedido;

    public pedidoCabecera(int folioPedido, int fechaPedido, int idProvedor, int fechaRegistro, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais) {
        super(idProvedor, fechaRegistro, nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
        this.folioPedido = folioPedido;
        this.fechaPedido = fechaPedido;
    }

    public int getFolioPedido() {
        return folioPedido;
    }

    public int getFechaPedido() {
        return fechaPedido;
    }
    @Override
    public void mostrarDatos(){
System.out.println("el folio del pedido es->"+getFolioPedido()+"la fecha del pedido es->"+getFechaPedido());
}  
}
