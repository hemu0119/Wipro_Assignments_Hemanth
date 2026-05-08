package Day2;

public class FoodOrderingSsytem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Menu");
        System.out.println("1)Chicken Fried Rice  2)Egg Fried Rice 3)Veg Fried Rice 4)Chicken Manchuria 5)Veg Manchuria");
        int option=1;
        switch(option){
        case 1:
        	System.out.println("Chicken Fried Rice is selected");
            break;
        case 2:
        	System.out.println("Egg Fried Rice is selected");
            break;
        case 3:
        	System.out.println("Veg Fried Rice is selected");
            break;
        case 4:
        	System.out.println("Chicken Manchuria is selected");
            break;
        case 5:
        	System.out.println("Veg Manchuria is selected");
            break;
           default:
        	   System.out.println("Invalid Option");
        }
	}

	

}