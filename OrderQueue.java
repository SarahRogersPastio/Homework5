package Homework5;

public class OrderQueue {
    LinkedQueue<CustomerOrder> OrderQueue = new LinkedQueue<CustomerOrder>();
    public int stock;
    public int queSize;

    public OrderQueue(){}

    public OrderQueue(int s, int q){
        this.stock = s;
        this.queSize = q;
    }

    public void addOrder(CustomerOrder o){
        OrderQueue.enqueue(o);
    }

    public void addStock(int n){
        this.stock += n;
    }

    public void fulfillOrder(){
        OrderQueue.getFront().quantity --;
        this.stock --;

        if (OrderQueue.getFront().quantity == 0){
            OrderQueue.dequeue();
        }
    }

    public void sellAll(){
        while (this.stock > 0){
            fulfillOrder();
        }
    }

    public String toString(){
        return "" + OrderQueue.getFront().quantity;
    }

}
