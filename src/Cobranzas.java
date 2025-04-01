public class Cobranzas {
    public void realizarConsultaSaldo() {
    ConsultaDeSaldo consulta = new ConsultaDeSaldo();
    consulta.transaccionOk();
}

    public void realizarRetiroEfectivo() {
        RetiroDeEfectivo retiro = new RetiroDeEfectivo();
        retiro.transaccionOk();
    }
}

