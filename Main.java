public class Main {

    public static void main(String [] args){
        Dog dog1 = new Dog("Шароёбик", 54.7, 3);

        Dog dog2 = new Dog("Расчленитель", 15.2, 2);

        Cat cat1 = new Cat("Мурзилище", 10.0, false);

        Fish fish1 = new Fish("Звездочёрт", 0.1);

        dog1.howToCareFor();
        dog2.howToCareFor();
        cat1.howToCareFor();
        fish1.howToCareFor();

        dog1.about();
        dog2.about();
        cat1.about();
        fish1.about();
    }
}
