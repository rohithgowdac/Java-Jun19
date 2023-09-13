class FabricRun{
public static void main(String[] args){
		double priceCotton = getPrice("cotton");
		System.out.println("refeence is: " + priceCotton);
		
		double priceNylon = getPrice("nylon");
		System.out.println("refeence is: " + priceNylon);
		
		double priceWoolen = getPrice("woollen");
		System.out.println("refeence is: " + priceWoolen);
		
		double pricePolyAster = getPrice("polyaster");
		System.out.println("refeence is: " + pricePolyAster);
		
		double priceSilk = getPrice("silk");
		System.out.println("refeence is: " + priceSilk);
		
		double priceLinen = getPrice("linen");
		System.out.println("refeence is: " + priceLinen);
	}
}