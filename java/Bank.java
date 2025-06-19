public class Bank {

	    float get_Rate_Of_Interest() {return 0;}
	    }
		class HDFC extends Bank{
		float get_Rate_Of_Interest() {return 2.5f;}
		}
		class SBI extends Bank{
		float get_Rate_Of_Interest() {return 6.5f;}
		}
		class CBI extends Bank{
	    float get_Rate_Of_Interest(){return 7.5f;}
		}
		class RBI extends Bank{
		float get_Rate_Of_Interest(){return 8.5f;}
		}
		class checkpolymorphism{
		public static void main(String args[]) {
		Bank b;
		b=new HDFC();
		System.out.println("BOB rate of interest is :"+b.get_Rate_Of_Interest());
		b=new SBI();
		System.out.println("SBI rate of interest is:"+b.get_Rate_Of_Interest());
		b=new CBI();
		System.out.println("CBI rate of interest is:"+b.get_Rate_Of_Interest());
		b=new RBI();
		System.out.println("RBI rate of interest is:"+b.get_Rate_Of_Interest());
		}
	}


