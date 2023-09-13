class EngineRun{
  
 public static void main(String[] args){
		int ccAudi = getCCByModel("audi");
		System.out.println("Reference is: " + ccAudi);
		
		int ccBmw = getCCByModel("bmw");
		System.out.println("Reference is: " + ccBmw);
		
		int ccRapid = getCCByModel("rapid");
		System.out.println("Reference is: " + ccRapid);
		
		int ccBenz = getCCByModel("benz");
		System.out.println("Reference is: " + ccBenz);
		
		int ccBently = getCCByModel("bently");
		System.out.println("Reference is: " + ccBently);
		
		int ccSwift = getCCByModel("swift");
		System.out.println("Reference is: " + ccSwift);
	}
}