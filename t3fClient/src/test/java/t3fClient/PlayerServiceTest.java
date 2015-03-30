package t3fClient;

import static org.junit.Assert.*;

import java.util.List;

import javax.naming.InitialContext;



import org.junit.BeforeClass;
import org.junit.Test;

import com.esprit.t3fjpa.domain.Player;
import com.esprit.t3fjpa.service.impl.PlayerService;

public class PlayerServiceTest {
	public static PlayerService playerService;
	

	@BeforeClass
	public static  void setUp() throws Exception{
		playerService=(PlayerService) new InitialContext().lookup("t3fJPA/PlayerServiceImpl!"+PlayerService.class.getCanonicalName());
		
		
		
		
		
	}

	@Test
	public void addPlayerTest() {
		
	Player player=new Player();
	
	player.setAge(1);
	player.setLastName("amenii");
	player.setLicenseNumber(23);
	player.setLogin("ameni");
	player.setPassword("111");
	playerService.add(player);
	

	

}
	
	@Test
	public void findByIdTest() {
		
		Player player1=playerService.findById(1);
		assertNotNull(player1);
		assertEquals("ameni", player1.getLastName());
	
	}
	@Test
	public void updateTest(){
		Player player1=playerService.findById(1);
		player1.setLastName("kooli");
		playerService.update(player1);
			
	}
	@Test
	public void findAllTest()
	{List<Player>players=playerService.findAll();
	assertEquals(1,players.size() );
		
		
	}
	@Test
	public void deleteTest(){
	Player player =playerService.findById(1);;
		playerService.delete(player);
		
	}
	@Test
	public void findAssociation(){
		String name=playerService.findAssociationByPlayer(1);
		assertEquals("ameni", name);
		
		
	}
	@Test
	public void findAchievementByPlayer(){
		assertEquals(1, playerService.findAchivementByPlayer(1).size());
		
	}
	}
