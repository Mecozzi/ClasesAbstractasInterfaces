public class RetiroDeEfectivo implements Transaccion{
       @Override
        public void transaccionOk(){
            System.out.println("Realizando retiro en efectivo ");}
        @Override
        public void transaccionNoOk(){
            System.out.println("Retiro de efectivo no realizado");
        }
    }


