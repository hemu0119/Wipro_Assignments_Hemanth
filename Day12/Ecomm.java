package Day12;
import java.util.*;
import java.io.*;
public class Ecomm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		while(true){System.out.println("\n1)New Order\n2)View order\n3)View Invoice\n4)Exit\n");
        int choice=sc.nextInt();
        if(choice==1) {
        	System.out.print("\nEnter Order ID : ");
            int orderId = sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter Customer Name : ");
            String name = sc.nextLine();
            System.out.print("\nEnter Product Name : ");
            String product = sc.nextLine();
            System.out.print("\nEnter Product Price : ");
            int price = sc.nextInt();

            sc.nextLine();

            System.out.print("\nEnter City : ");
            String city = sc.nextLine();
            System.out.print("\nEnter Pincode : ");
            int pincode = sc.nextInt();
            SaveOrder(orderId,name,product,price,city,pincode);
        }
        else if(choice==2) {
        	ViewOrder();
        }
        else if(choice==3) {
        	System.out.print(
                    "\nEnter Order ID to get Invoice : ");
            int id= sc.nextInt();
            ViewInvoice(id);
        }
        else {
        break;	
        }}
	}
	public static void SaveOrder(int orderId, String name, String product, int price,String city,int pincode) throws IOException {
		 FileWriter fw =
	                new FileWriter("orders.txt",true);
	        fw.write(orderId + ","+ name + ","+ product + ","+ price + "\n");
	        fw.close();
	        FileWriter sw =new FileWriter("shipping.txt",true);
	        sw.write(orderId + ","+ name + ","+ city + ","+ pincode + "\n");
	        sw.close();
	        FileWriter iw=new FileWriter("invoice_"+ orderId+ ".txt");
	        iw.write("Order ID : "+ orderId + "\n");
	        iw.write("Customer : "+ name + "\n");
	        iw.write("Product : "+ product + "\n");
	        iw.write("Price : "+ price + "\n");
	        iw.write("City : "+ city + "\n");
	        iw.write("Pincode : "+ pincode + "\n");
	        iw.close();
	        System.out.println(
	                "Order Saved");
	}
	public static void ViewOrder() throws IOException   {
		BufferedReader br =
		        new BufferedReader(
		                new FileReader(
		                        "orders.txt"));

		String line;

		while((line = br.readLine()) != null){

		    System.out.println(line);
		}

		br.close();
	}
	public static void ViewInvoice(int id) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("invoice_"+id+ ".txt"));
        String line;
        System.out.println(
                "\nInvoice Details\n");
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        }
	}
	

