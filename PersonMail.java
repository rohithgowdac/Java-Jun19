public class PersonMail{
	static String getEmailByName(String name){
		System.out.println("Email of the personrunner");
		if(name != null){
			if(name == "usha"){
				System.out.println("Name is: " + name);
				return "usha@gmail.com";
			}
			if(name == "sudha"){
				System.out.println("Name is: " + name);
				return "sudha@gmail.com";
			}
			if(name == "kushi"){
				System.out.println("Name is: " + name);
				return "kushi@gmail.com";
			}
			if(name == "sushma"){
				System.out.println("Name is: " + name);
				return "sushma@gmail.com";
			}
			if(name == "punith"){
				System.out.println("Name is: " + name);
				return "punith@gmail.com";
			}
			if(name == "devraju"){
				System.out.println("Name is: " + name);
				return "devraju@gmail.com";
			}
			if(name== "aishu"){
				System.out.println("Name is: " + name);
				return "aishu@gmail.com";
			}
			if(name == "veena"){
				System.out.println("Name is: " + name);
				return "veena@gmail.com";
			}
			if(name == "teju"){
				System.out.println("Nameis: " + name);
				return "teju@gmail.com";
			}
			if(name == "asha"){
				System.out.println("Name is: " + name);
				return "asha@gmail.com";
			}
		}
		else{
			System.out.println("Name given is invalid");
		}
		return "EMail";
	}
}