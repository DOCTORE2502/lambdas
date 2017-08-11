
package lambdas;

public class TestOperLambda {
    public static void main(String[] args) {
        TestOperLambda test = new TestOperLambda();
        test.calcular();
    }
    
    public void calcular(){
        Operaciones operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcProm(18,20));
    }
}
