package chapter5.constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personDo = new Person();
        personDo.name = "도수빈";
        personDo.height = 160.0F;
        personDo.weight = 48.0F;

        Person personKim = new Person("김준호",171,64);
    }

}
