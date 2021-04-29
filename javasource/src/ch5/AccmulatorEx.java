package ch5;

public class AccmulatorEx {
	public static void main(String[] args) {

		Accmulator acc1 = new Accmulator();
		acc1.accmulate(10);
		
		Accmulator acc2 = new Accmulator();
		acc2.accmulate(200);
		
		System.out.printf("acc1 total = %d, " + "acc grandTotal = %d\n", acc1.total, Accmulator.grandTotal);
		System.out.printf("acc2 total = %d, " + "acc grandTotal = %d\n", acc2.total, Accmulator.grandTotal);
	}

}
