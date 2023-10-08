public class Main {
    public static void main(String[] args) {
        Hero mider = new Mider();
        Hero Hard_Support = new Hard_Support();
        Hard_Support = new Force_Staff(Hard_Support );
        mider = new Desolater(mider);
        mider = new Travel_boots(mider);
        System.out.println(mider.Items());
        System.out.println(Hard_Support.Items());
    }
    }
