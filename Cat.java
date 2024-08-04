public class Cat extends HousePet{
    boolean isOutdoor;

    public Cat(String name, double weight, boolean isOutdoor){
        super(name, weight, "мяу");
        this.isOutdoor = isOutdoor;
    }

    @Override
    public void howToCareFor(){
        System.out.println(isOutdoor ? "Разрешать " : "Не разрешать " + name + " гулять на улице.");
    }
}
