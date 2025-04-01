public class Transferencia implements Transaccion{
    @Override
    public void transaccionOk(){
        System.out.println("Realizando transaccion");}
    @Override
    public void transaccionNoOk(){
        System.out.println("Transferencia no realizada");
    }
}
