
public class Temporary extends DataStore {
	static int b,d,w,ac;
	static String p;
	
	public void set_atm(int a){ ac=a;}
	
	public int get_atm(){ return ac;}
	
	public void settempintbal(int x) { b=x;	}

	public void settempstringpin(String y) {p=y;}

	public void settempintdeposit(int d1) {d=d1;   }

	public void settempintwithdraw(int w1) {w=w1;  }

	public int gettempintbal() {  return (b);	}

	public String gettempstringpin() { return p;}
	
	public int gettempintdeposit() {  return d;	}

	public int gettempintwithdraw() { return w;	}
	
	
//ATM 2:
	static float b2,w2,d2;
	static int p2;

	public void settempfloatbal(float x) { b2=x;	}

	public void settempintgpin(int y) { p2=y;}
	
	public void settempfloatdeposit(float d) {d2=d;}

	public void settempfloatwithdraw(float w) { w2=w;}
	
	public int gettempintpin() { return p2;	}

	public float gettempfloatbal() {return b2;}
	
	public float gettempfloatdeposit() {return d2;}
	
	public float gettempfloatwithdraw() {return w2;}
	
	
}
