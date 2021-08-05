package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {

    //Declaring Variables
    private ArrayList<MenuItem> menuItem = new ArrayList<>();

    //Current Date
    private Date date;
//    private Date date=java.util.Calendar.getInstance().getTime();
//    private int date = new Date().getDay();
//    private LocalDate date;

    //Constructors
  public Menu (){
        this.menuItem = new ArrayList<MenuItem>();
        this.date = date;
            }

    //Creating an instance for MenuItem class
//    MenuItem itemName = new MenuItem();

  //toString Method
    @Override
    public String toString() {
        return "Menus : \n" +
                "Item Name : " + menuItem +
                "\nDate : " + date ;
    }

    //Methods
public boolean checkItem(Date givenDate){
        if (givenDate.equals(date)) {
            return true;
        }
        else{
            return false;
        }
}

//Add menu to the Menulist
public void addNewMenu(MenuItem newMenuName){
        if(!(this.menuItem.contains(newMenuName))){
            this.menuItem.add(newMenuName);
            this.date = java.util.Calendar.getInstance().getTime();
        }

}

//Remove menu from the Menulist
//public void removeMenu (String name){
//    int indexOfMenu = menuItem.indexOf(name);
//    menuItem.remove(indexOfMenu);
//    System.out.println(menuItem);
//    }



}
