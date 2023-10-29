public class Main {
    public static void main(String[] args) {
        International TI = new International();

        TI.addEvents("Team Spirit VS PSG.LGD");
        TI.addEvents("Gladiators VS BetBoom");

        IObserver subscriber1 = new Subscriber("Subscriber1");
        IObserver subscriber2 = new Subscriber("Subscriber2");

        TI.addObserver(subscriber1);
        TI.addObserver(subscriber2);

        TI.addEvents("Virtus Pro VS 9Pandas");
        TI.removeEvents("Gladiators VS BetBoom");


    }
}
