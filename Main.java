import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        fbmanager nowy = new fbmanager("Mariusz", 25_000 );
        System.out.println(nowy.getName() + " " + nowy.getSalary()+ " \n"+ nowy.isSatisfied());
        for (String list:){
            System.out.println(list);
        }
    }
}
