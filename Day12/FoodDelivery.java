package Day12;
import java.util.*;
import java.io.*;
public class FoodDelivery {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
AddMenu();
while(true) {
	System.out.println("\n1)Menu\n2)Order\n3)DeliveryStatus\n4)Exit\n");
	int choice=sc.nextInt();
	if(choice==1) {
		ViewMenu();
	}
	else if(choice==2) {
		System.out.println("\nEnter order id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter Name: ");
		String name=sc.nextLine();
		System.out.println("\nEnter Item id: ");
		int itemId=sc.nextInt();
		sc.nextLine();
		
		TakeOrder(id,name,itemId);
	}
	else if (choice==3) {
		System.out.println("\nEnter order id to know delivery status: ");
		int id=sc.nextInt();
		DeliveryStatus(id);
	}
}
	}
	public static void AddMenu() throws IOException {
		FileWriter fw =
                new FileWriter(
                        "menu.txt",
                        true);
        fw.write(
                "1,Burger,150\n");
        fw.write(
                "2,Pizza,250\n");
        fw.write(
                "3,FrenchFries,100\n");
        fw.close();
	}
	public static void ViewMenu() throws IOException {
		BufferedReader br =
		        new BufferedReader(
		                new FileReader(
		                        "menu.txt"));

		String line;
		while((line = br.readLine()) != null){

		    System.out.println(line);
		}

		br.close();
	}
	public static void TakeOrder(int orderid,String name,int itemId) throws IOException {
		BufferedReader br =
                new BufferedReader(
                        new FileReader(
                                "menu.txt"));
        String line;
        String itemName = "";
        int price = 0;
        while((line = br.readLine()) != null){
            String[] data = line.split(",");
            int id =
                    Integer.parseInt(data[0]);

            if(id == itemId){
                itemName = data[1];
                price =Integer.parseInt(
                                data[2]);
                break;
            }
        }
        br.close();

        FileWriter fw =
                new FileWriter(
                        "Foodorders.txt",
                        true);

        fw.write(orderid + ","
                + name + ","
                + itemName + ","
                + price + "\n");

        fw.close();
        System.out.println(
                "Order Placed");
        System.out.println(
                "Item : " + itemName);
        System.out.println(
                "Price : " + price);
        FileWriter dw =
                new FileWriter(
                        "delivery.txt",
                        true);

        dw.write(orderid + ","
                + "Preparing"
                + "\n");

        dw.close();
	}
public static void DeliveryStatus(int id ) throws IOException {
	FileWriter fw =
            new FileWriter(
                    "delivery.txt",
                    true);
    fw.write(id + ",Delivered\n");
    fw.close();
    BufferedReader br =
            new BufferedReader(
                    new FileReader(
                            "delivery.txt"));
    String line;
    System.out.println(
            "\nDelivery Logs\n");
    while((line = br.readLine()) != null){
        String[] data =
                line.split(",");

        if(Integer.parseInt(data[0]) == id){

            System.out.println(
                    "Order ID : "
                            + data[0]);

            System.out.println(
                    "Status : "
                            + data[1]);
        }
    }

    br.close();
}
}