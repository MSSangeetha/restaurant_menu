package restaurant;

public class Restaurant {
    //Main method
    public static void main(String[] args) {
        // write your code here
        //Creating an instance for Menu class
        Menu name = new Menu();

//        //Creating an instance for MenuItem class
        MenuItem itemNameOne = new MenuItem("Biriyani",15.0,"Indian","Main Course",false);
        MenuItem itemNameTwo = new MenuItem("Pasta",18.0,"Italian","Main Course",true);
        //Adding MenuItems to Menu
        name.addNewMenu(itemNameOne);
        name.addNewMenu(itemNameTwo);
//        name.addNewMenu(new MenuItem("Pasta",18.0,"Italian","Main Course",true));
        //calling getcategory in menuitem class

//        for (String items : name) {
//            System.out.println(items);
//        }
        System.out.println(itemNameOne.getCategory());

        System.out.println(name);




//        System.out.println(menuName.getMenuItem());
//
//        menuName.addNewMenu("Pulav");
//
//        System.out.println(menuName.getMenuItem());
//
//       menuName.removeMenu("Ice cream");

        //setting a new category by calling setcategory in menuitem class
//        System.out.println(itemName.setCategory("Dish"));

    }

    //calling



}
