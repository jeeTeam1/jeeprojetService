package t3fClient;

import static org.junit.Assert.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.esprit.t3fjpa.domain.Clerck;
import com.esprit.t3fjpa.service.impl.ClerckService;


public class ClerckServiceTest {
public static ClerckService clerckService ;
public Clerck clerck;
@BeforeClass
public static void setUp() throws NamingException{
clerckService=(ClerckService) new InitialContext().lookup("t3fJPA/ClerckServiceImpl!"+ClerckService.class.getCanonicalName());
}

	@Test
	public void addClerckTest() {
		clerck=new Clerck();
		clerck.setLastName("kooli");
		clerck.setLogin("ameni");
		clerck.setName("hhh");
		clerck.setPassword("111");
		clerckService.add(clerck);
		
		
	}

}
