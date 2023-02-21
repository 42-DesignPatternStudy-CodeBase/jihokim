package c_DecoratorPattern;

public class Example {
    public static void main(String[] args) {
        Component KenyaAmericano = new KenyaCoffee();
        System.out.println(KenyaAmericano.add());

        Component MilkKenyaAmericano = new MilkDecorator(new KenyaCoffee());
        System.out.println(MilkKenyaAmericano.add());

        Component MoChasyupMilkKenyaAmericano = new MochaSyrupDecorator(new MilkDecorator(new KenyaCoffee()));
        System.out.println(MoChasyupMilkKenyaAmericano.add());
        
        Component MilkMoChasyupKenyaAmericano = new MilkDecorator(new MochaSyrupDecorator((new KenyaCoffee())));
        System.out.println(MilkMoChasyupKenyaAmericano.add());

        Component EriopiaAmericano = new WhippedCreamDecorator(new MochaSyrupDecorator(new MilkDecorator(new EtiopiaCoffee())));
        System.out.println(EriopiaAmericano.add());
	}
}
