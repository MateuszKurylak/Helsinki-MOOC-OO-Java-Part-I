
public class Main {

    public static void main(String[] args) {

        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 80);
        Person mateusz = new Person("Mateusz", 26, 187, 86);

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

        eastHelsinkiReformatory.feed(mateusz);
        eastHelsinkiReformatory.feed(mateusz);
        eastHelsinkiReformatory.feed(mateusz);
        eastHelsinkiReformatory.feed(mateusz);

        System.out.println(mateusz.getName() + " weight: " + eastHelsinkiReformatory.weight(mateusz) + " kilos");
        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());
    }
}
