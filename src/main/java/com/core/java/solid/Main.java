package com.core.java.solid;

public class Main {
    public static void main(String[] args) {
        /*s-> Each class should have only one reason to change it*/
        BreadBaker breadBaker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        breadBaker.bakeBread();
        inventoryManager.manageInventory();
        supplyOrder.orderSupplies();

        /*o- open for extension but closed for modification*/
         PaymentProcessing creditCardPayment = new CreditCardPayment();
         PaymentProcessing payPalPayment =  new PayPalPayment();
         creditCardPayment.processPayment(200.99);
         payPalPayment.processPayment(400.88);

        /*Liskov substitution principle
        - Derived or subclass must be substitutable for their base or parent class */
         IColor color = new Green();
         IColor color1 = new Blue();

         /*Interface Segregation principle - do not force any client to implement an interface which is irrelevant to them*/

        /*High level module should not depend on low level module*/
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();

    }
    private static void processPayment(PaymentProcessing paymentProcessing,double amount){
        paymentProcessing.processPayment(amount);
    }
}
class BreadBaker{
    public void bakeBread(){
        System.out.println("Baking high quality bread..");
    }
}
class InventoryManager{
    public void manageInventory(){
        System.out.println("Managing Inventory");
    }
}
class SupplyOrder{
    public void orderSupplies(){
        System.out.println("Ordering supplies");
    }
}
abstract class PaymentProcessing{
    abstract void processPayment(double amount);
}
class CreditCardPayment extends PaymentProcessing{

    @Override
    void processPayment(double amount) {
        System.out.println("Credit card payment : "+amount);
    }
}
class PayPalPayment extends PaymentProcessing{

    @Override
    void processPayment(double amount) {
        System.out.println("PayPal payment : "+amount);
    }
}
interface IColor{
    public void getColor();
}
class Green implements IColor{

    @Override
    public void getColor() {
        System.out.println("Green");
    }
}
class Blue implements IColor{

    @Override
    public void getColor() {
        System.out.println("Blue");
    }
}

interface Switchable{
    void turnOn();
    void turnOf();
}
 class LightBulb implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Bulb on");
    }

    @Override
    public void turnOf() {
        System.out.println("Bulb off");
    }
}
class Switch{
    Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }
    public void operate(){
        device.turnOf();

    }
}