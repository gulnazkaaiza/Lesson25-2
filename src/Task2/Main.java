package Task2;

public class Main {
        public static void main(String[] args) {
            CustomerBasket customerBasket = new CustomerBasket();
            customerBasket.addProduct("Банан", 3);
            customerBasket.addProduct("Яблоко", 10);
            customerBasket.addProduct("Ананас", 4);
            System.out.println(customerBasket.toString());
            System.out.println();
            customerBasket.addProduct("Манго", 5);
            System.out.println(customerBasket.toString());
            customerBasket.removeProduct("Банан");
            System.out.println(customerBasket.toString());
            customerBasket.updateProductQuantity("Яблоко", 5);
            System.out.println(customerBasket.toString());
            System.out.println(customerBasket.getProductQuantity("Яблоко"));
            customerBasket.updateProductQuantity("Ананас", 2);
            System.out.println(customerBasket.toString());
            System.out.println(customerBasket.getProducts());
            customerBasket.clear();
            System.out.println(customerBasket.toString());
        }
    }

