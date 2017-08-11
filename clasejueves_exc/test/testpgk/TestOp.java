package testpgk;


import com.oracle.operaciones.Operaciones;
import junit.framework.Assert;
import org.junit.Test;

public class TestOp {
    @Test
    public void testOp() {
        Operaciones op = new Operaciones();
        int result = op.sumar(5, 4);
        
        Assert.assertEquals(9, result);
    }
}
