package mathTests;

public class Test {

	public void commu() {
		System.out.println("commu");
		Maths maths = new Maths();
		boolean tf = true;
		for (double j = 1; j <= 10000; j++) {
			double k = j + 1;
			double a1;
			double a2;
			// Change to whatever your method is
			a1 = maths.rectangize(j, k);
			a2 = maths.rectangize(j, k);
			if (a1 != a2) {
				System.out.println(false);
				tf = false;
			} else {
				System.out.println("true!");
			}
		}
		if (tf) {
			System.out.println("Done!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Final Result: True");
		} else {
			System.out.println("Done!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Final Result: False");
		}
	}

	public void asso() {
		System.out.println("asso");
		Maths maths = new Maths();
		boolean tf = true;
		for(double j = 0;j <= 10000; j++){
			double k = j + 1;
			double l = j + 2;
			double a = maths.rectangize(k,l);
			double b = maths.rectangize(j, a);
			double c = maths.rectangize(j, k);
			double d = maths.rectangize(c, l);
			if(d!=a){
				tf = false;
				System.out.println("FALSE");
			}else{
				System.out.println("TRUE");
			}
			
			
		}
		System.out.println("Done!");
		System.out.println("Final result is: "+tf);
	}
}
