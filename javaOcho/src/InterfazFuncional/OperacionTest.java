package InterfazFuncional;


public class OperacionTest {
    
    public static void main(String[] args) {
        double valor = OperacionTest.operar(10,23);
        
        System.out.println("::::" + valor );
    }
    
    public static double operar(double x, double y){
        Operacion op = (double n1,double n2) -> n1+ n2;
        return op.calcular(y, y);
    }
}
