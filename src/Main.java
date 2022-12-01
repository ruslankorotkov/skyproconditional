public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18);

        {System.out.println(" поздровляем с совершеннолетием. ");}

        if (age < 18);

        { System.out.println(" возраст совершеннолетия ещё не наступил, нужно немного подождать. ");}
        int babyAge = 10;
        if (babyAge >= 7);
        { System.out.println(" ребенок ходит в школу. ");}
        if (babyAge >= 18);
        { System.out.println(" человек уже закончил школу и может отправляться в университет. ");}
        if (babyAge >= 24);
        { System.out.println(" человек окончил университет и ему пора искать первую работу. ");}
        int placeAll = 102;
        int placeSit =60;
        boolean placeSits = placeSit <= 60;
        int placeStay = placeAll - placeSit;
        boolean placeStays = placeStay <= 42;
        { System.out.println(" сидячие мест " + placeStay );}
        if (placeSit <= 60);
        { System.out.println(" сидячие места есть. ");}
        if (placeSit > 60);
        { System.out.println(" сидячих мест нет. ");}
        if (placeStay <= 42);
        { System.out.println(" стоячии места есть. ");}
        if (placeStay > 42);
        { System.out.println(" стоячих мест нет. ");}
        if (placeAll >= 102);
        { System.out.println(" вагон забит. ");}
    }
}