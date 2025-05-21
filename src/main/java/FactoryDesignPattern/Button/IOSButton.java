package FactoryDesignPattern.Button;

public class IOSButton implements Button {

    @Override

    public void modifyButtonSize(){

        System.out.println("Modifying size of IOS Button");
    }
}
