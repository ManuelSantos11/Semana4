
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola a Todos ustedes!!!");
		
		int a=5;
		int b=100;
		int res=0;
		
		res=a + b;
		// Suma
		System.out.println("Suma : "+res);
	
		float c = 20.0f;
		float d = 5.7f;
		float resu = 0.0f;
		
		resu = a + d;
		//res = a + d;
		
		System.out.println("Suma float : "+resu);
		
		//Chicharronera
		
		double x1= ((-b)+ Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		double x2= ((-b)- Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		
		System.out.println("X1 : "+x1 + "X2 : "+x2);
		
		 
		System.out.println("///////////////////////////////////////////");
		
		String [] meses = {"Juan", "Miguel", "Manuel", "Edgar", "Magali", 
				"Hector", "Alex", "Pablo", "Mago", "Cesar"};
		
		String [] sem = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		System.out.print(meses[0]+" "+meses[6]+" "+meses[9]+" "+meses[4]+" "+sem[2]+" "+sem[6]);
		
		boolean x = true;
		boolean az = false;
		System.out.println("\n\n");
		//System.out.println(x != az);
		
		if(x == az)
		{
			System.out.println("Chanaaaa");
		}
		else if(x==az)
		{
		System.out.println("Juaanaaa!!");
		}
		else if(x==az)
		{
			System.out.println("Melon!!!");
		}
		else if(!x == !az)
		{
			System.out.println("Sandia!!");
		}
		else if(!(x == az))
		{
			System.out.println("La vieja del otro dia!!");
		}
		else
		{
			System.out.println("Ni modo!!");
		}
	}
	
	}

		