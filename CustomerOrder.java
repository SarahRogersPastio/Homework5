package Homework5;

public class CustomerOrder {
    public String name;
    public String date;
    public int quantity;

    public CustomerOrder(){}

    public CustomerOrder(String n, String d, int q){
        this.name = n;
        this.date = d;
        this.quantity = q;
    }

    public void ship(){
        if (quantity < 0){
            quantity--;
        }
        else{ // incase the initial quantity was neg for some reason
            quantity = 0; 
        }
    }




}
