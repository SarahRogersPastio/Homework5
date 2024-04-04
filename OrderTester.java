package Homework5;

public class OrderTester {
    public static void main(String[] args) {
        
        OrderQueue que = new OrderQueue(14,0);

        CustomerOrder c1 = new CustomerOrder("Link", "01/01/24", 5);
        CustomerOrder c2 = new CustomerOrder("Zelda", "01/02/24", 5);
        CustomerOrder c3 = new CustomerOrder("Ganon", "01/03/24", 8);

        que.addOrder(c1);
        que.addOrder(c2);
        que.addOrder(c3);

        System.out.println(que.toString());

        que.sellAll();

        System.out.println(que.toString());

        que.addStock(10);

        CustomerOrder c4 = new CustomerOrder("Link", "02/01/24", 3);
        CustomerOrder c5 = new CustomerOrder("Zelda", "02/02/24", 3);
        CustomerOrder c6 = new CustomerOrder("Ganon", "02/03/24", 5);

        que.addOrder(c4);
        que.addOrder(c5);
        que.addOrder(c6);

        que.sellAll();

        System.out.println(que.toString());
    }
}
