class Test{

	public Rec re;

	Test(){
		re = new Rec();
		System.out.print("Testing: fbc  ");
		tfbc(0, 0);
		tfbc(1, 1);
		tfbc(9, 34);
		tfbc(20, 6765);
		tfbc(43, 433494437);
		System.out.println();
		System.out.print("Testing: ggT  ");
		tggT(1, 1, 1);
		tggT(1, 2, 1);
		tggT(2, 1, 1);
		tggT(2, 2, 2);
		tggT(3, 2, 1);
		tggT(2, 3, 1);
		tggT(4, 2, 2);
		tggT(2, 4, 2);
		tggT(36, 6, 6);
		tggT(6, 36, 6);
		tggT(12, 18, 6);
		tggT(3528, 3780, 252);
		tggT(3780, 3528, 252);
		System.out.println();
	}

	public void tfbc(int i, int e){
		if(re.fbc(i) != e) System.err.println("\nfbc: doesn't meet expected value for " + i);
		System.out.print("-");
	}

	public void tggT(int a, int b, int e){
		if(re.ggT(a, b) != e) System.out.println("\nggT: doesn't meet expected value for " + a + " and " + b);
		System.out.print("-");
	}

}