//import required packages here
import java.util.Scanner; 
class Item
{
  private int price;
  //create various method to return attribute value(s)
	public void setprice(int price){
		this.price=price;
		}
	public int getprice(){
    	return price;
		}
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
	public void setproduct(String product){
		this.product=product;
		}
	public void setquantity(int quantity){
		this.quantity=quantity;
		}
	public int getquantity(){
    	return quantity;
		}
		public String getproduct(){
    	return product;
		}
}

class Bill extends Customer
{
  //implement your logic to calculate total price
	public int result(int p,int q){
		return p*q;
		}
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
	Scanner sc= new Scanner(System.in);
	String product= sc.next();
	int price= sc.nextInt();
	int quantity= sc.nextInt();
    i.setprice(price);
    c.setproduct(product);
	c.setquantity(quantity);
	int p=i.getprice();
	int q=c.getquantity();
	int d=obj.result(p,q);
	System.out.print("Total Price is : "+d);
  }
}