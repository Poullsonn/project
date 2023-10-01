
class DataBase{
    private static String name = "dsadasdsa";
    private static DataBase base;


    public  static DataBase getInstance(){
        if(base == null){
            base = new DataBase();
            return base;
        }
        return base;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Main {
    public static void main(String[] args){
        DataBase dataBase1 = DataBase.getInstance();
        DataBase dataBase2 = DataBase.getInstance();
        DataBase dataBase3 = DataBase.getInstance();
        DataBase dataBase4 = DataBase.getInstance();
        DataBase dataBase5 = DataBase.getInstance();
        System.out.println(dataBase1.equals(dataBase2));
    }
}
