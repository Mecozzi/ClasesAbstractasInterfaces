public class ConsultaDeSaldo implements Transaccion{
        @Override
        public void transaccionOk(){
            System.out.println("Realizando consulta de saldo");}
        @Override
        public void transaccionNoOk(){
            System.out.println("Consulta de saldo no realizada");
        }

}
