class Rec{

	public int ggT(int a, int b){
		if(b == 0) return a;
		if(a == 0) return b;
		if (a > b) {
			return (ggT((a - b), b));
		}
		else {
			return (ggT(a, (b - a)));
		}
	}

	public int fbc(int i){
		if(i < 0){
			System.err.println("fbc: No negative input allowed");
			return -1;
		}
		switch (i) {
			case 0: return 0;
			case 1: return 1;
			default: return (fbc(i-1) + fbc(i-2)); 
		}
	}
	
}