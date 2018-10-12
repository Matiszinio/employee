import java.util.ArrayList;
import java.util.List;

public abstract class manager extends employee {
    public manager(String name, double salary) {
        super(name, salary);
    }

    List<String> list = new ArrayList<String>();

    public abstract void Hire();

    public abstract boolean isHire();
    public void adding() {
    if (isHire() == true) {
        list.add(getName());
    }
}



}
