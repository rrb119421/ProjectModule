package in.nit.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/ord")
public class OrderRestController {
	@POST
	public String placeorder(
			@FormParam("itemName")String tname,
			@FormParam("qty")int qty,
			@FormParam("cost")double cost,
			@FormParam("hotel")String hotel
			) {
		StringBuffer sb=new StringBuffer();
		sb.append("your order is").append(in)
		.append("Bill amt is ").append(qty*cost)
		.append("From hotel").append(hotel);
		
		return sb.toString();
	}
}

	


