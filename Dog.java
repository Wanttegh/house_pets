public class Dog extends HousePet{
    int walksPerDay;

    public Dog(String name, double weight, int walksPerDay){
        super(name, weight, "гав");
        this.walksPerDay = walksPerDay;
    }

    @Override
    public void howToCareFor(){
        System.out.print("Выгуливать " + name);
        System.out.println(" " + walksPerDay + " раз(-а) в день.");
    }
}
