
import com.oracle.consultas.DAO.MedicoDAOImpl;
import com.oracle.consultas.DAO.MedicoDao;
import com.oracle.consultas.model.Medico;
import org.junit.Test;

public class MedicoDAOTest {
    
    @Test
    public void crearMedicoTest(){
        MedicoDao medicoDAO = new MedicoDAOImpl();
        
        Medico simi = new Medico();
        simi.setCodigo( 1001);
        simi.setNombre("Dr Simi");
        simi.setApellido("Barato");
        simi.setEspecialidad("Generico");        
        
        medicoDAO.crearMedico(simi);
    }
}
