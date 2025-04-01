public class Banco {
    public static void main(String[]args){
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.realizarDeposito();
        ejecutivo.realizarTransaccio();

        Basico basico = new Basico();
        basico.consultaSaldo();
        basico.pagoDeServicos();
        basico.retirarEfectivo();

        Cobranzas cobranzas = new Cobranzas();
        cobranzas.realizarConsultaSaldo();
        cobranzas.realizarRetiroEfectivo();
    }
}
