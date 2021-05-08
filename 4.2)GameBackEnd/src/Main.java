import java.util.Date;

import Abstract.BaseCampaignManager;
import Abstract.BaseCategoryManager;
import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CategoryManager;
import Concrete.DefaultCheckManager;
import Concrete.GameBoosterManager;
import Concrete.GameItemManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.OrderManager;
import Concrete.ProducerManager;
import Concrete.SalesmanManager;
import Entities.Campaign;
import Entities.Category;
import Entities.Game;
import Entities.GameBooster;
import Entities.GameItem;
import Entities.Gamer;
import Entities.Order;
import Entities.Producer;
import Entities.Salesman;
import Entities.User;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BaseUserManager userManagerGamer = new GamerManager(new MernisServiceAdapter());
		Gamer gamer = new Gamer(1,"melih","melih@gmail.com","123456",0,0,0, "Muhammed Melih","Çelik","00000000000",0000);
		userManagerGamer.save(gamer);
		
		Producer producer = new Producer(2, "GameStudio", "gamestudio@mail.com", "123456", "En sürükleyici oyunlar", "Sakarya", "website.com");
		BaseUserManager userManagerProducer = new ProducerManager(new DefaultCheckManager());
		userManagerProducer.save(producer);
		
		Salesman salesman = new Salesman(3, "Marketman1", "salesman@mail.com", "123987", 0, "Acemi");
		BaseUserManager userManagerSalesman  = new SalesmanManager();
		userManagerSalesman.save(salesman);
		
		Category category1 = new Category(1, "Macera", "Macera oyunlarý kategorisi");
		BaseCategoryManager baseCategoryManager = new CategoryManager();
		baseCategoryManager.save(category1);
		
		Campaign campaign = new Campaign(1, 1, "Ýndirimli  Oyun", "indirimli oyun fýrsatý", "INDIRIM10", new Date());
		BaseCampaignManager baseCampaignManager = new CampaignManager();
		baseCampaignManager.save(campaign);
				
		Game oyun1 = new Game(1,"Oyun1","Keyifli bir oyun",new Date(), (float) 100,1,1,0,"oyun1.com");
		GameManager gameManager = new GameManager();

		Order order1 = new Order(1, 1, 1, 1, 1, 100, 10);
		OrderManager manager = new OrderManager(userManagerGamer, gameManager, baseCampaignManager);
		manager.save(order1.getId(),order1.getGamerId(), order1.getProductId(), order1.getCampaignId(), order1.getAmount(), order1.getUnitPrice(), order1.getPercentageOfDiscount());
		
		gameManager.save(oyun1);
		
		baseCampaignManager.delete(campaign);
		
		GameItem gameItem = new GameItem(2, "Süper Kýlýç", "Çok güçlü bir kýlýç", new Date(), (float) 20.5, 2, 1, "Efsanevi", true);
		GameItemManager gameItemManager = new GameItemManager();
		
		Campaign campaign2 = new Campaign(2,2,"Eþya kampanyasý","Efsane eþya kampanyasý","ESYAKKAMP",new Date());
		BaseCampaignManager baseCampaignManager2 = new CampaignManager();
		baseCampaignManager2.save(campaign2);
		
		Order order2 = new Order(2, 1, 2, 2, 1, 20.5,  20);		
		OrderManager manager2 = new OrderManager(userManagerGamer, gameItemManager, baseCampaignManager2);
		manager2.save(order2.getId(),order2.getGamerId(),order2.getProductId(),order2.getCampaignId(),order2.getAmount(),order2.getUnitPrice(),order2.getPercentageOfDiscount());
		
		gameItemManager.save(gameItem);
		
		baseCampaignManager2.delete(campaign2);
		
		GameBooster gameBooster = new GameBooster(3, "Hýzlý Vuruþ", "Daha hýzlý vuracaksýn", new Date(), (float) 10.7, 2, 1, 50000, 20);
		GameBoosterManager gameBoosterManager = new GameBoosterManager();
		
		Campaign campaign3 = new Campaign(3,3,"Boostlan","Boost Kampanyasý","BOOST",new Date());
		BaseCampaignManager baseCampaignManager3 = new CampaignManager();
		baseCampaignManager3.save(campaign3);
		
		Order order3 = new Order(3,1,3,3,1,10.7,50);
		OrderManager manager3 = new OrderManager(userManagerGamer,gameBoosterManager,baseCampaignManager3);
		manager3.save(order3.getId(), order3.getGamerId(), order3.getProductId(), order3.getCampaignId(), order3.getAmount(), order3.getUnitPrice(), order3.getPercentageOfDiscount());
		
		gameBoosterManager.save(gameBooster);
		
		baseCampaignManager3.delete(campaign3);
				
	}

}
