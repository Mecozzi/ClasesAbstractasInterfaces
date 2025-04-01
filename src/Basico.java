public class Basico {
    public void consultaSaldo(){
        ConsultaDeSaldo consultaDeSaldo = new ConsultaDeSaldo();
        consultaDeSaldo.transaccionOk();
    }
    public void  pagoDeServicos(){
        PagoDeServicios pagoServicios = new PagoDeServicios();

        pagoServicios.transaccionOk();
    }
    public void retirarEfectivo(){
        RetiroDeEfectivo retiroDeEfectivo = new RetiroDeEfectivo();
        retiroDeEfectivo.transaccionOk();
    }
}
