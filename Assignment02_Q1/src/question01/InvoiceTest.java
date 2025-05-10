package question01;

public class InvoiceTest {
	public static void main(String[] args) {
//		Invoice in =new Invoice("bullet","machine guns used ", 10, 10);
//		in.amount();
		
		Invoice in =new Invoice("bullet","machine guns used ", 10, 10);
		in.setPartNo("bullet");
		in.setDescription("used in pistol");
		in.setQuantity(12);
		in.setPrice(-1);
		in.display();
		in.amount();
	}
}
