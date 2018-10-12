public class femanager extends manager {
    public femanager(String name, double salary) {
        super(name, salary);
    }

    private int hiringLimit=5;
    public boolean isHire(){return hiringLimit>0;}
    public void Hire(){
        if (isHire()==true){
            hiringLimit--;
        }
    }

    public boolean isSatisfied() {
        return salary > 20_000 && hiringLimit == 0;
    }
}