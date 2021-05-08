package Abstract;

import Entities.Order;

public interface OrderService extends GenericService<Order>{

	void save(int id,int gamerId,int productId,int campaignId,int amount,double unitPrice,double percentageOfDiscount);
	void update(int id,int gamerId,int productId,int campaignId,int amount,double unitPrice,double percentageOfDiscount);	
	void delete(int id);
}