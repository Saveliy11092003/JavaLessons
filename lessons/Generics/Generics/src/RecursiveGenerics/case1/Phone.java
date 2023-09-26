package RecursiveGenerics.case1;


public class Phone extends Product<Phone> {
    String model;

    public Phone(String model){
        super(45);
        this.model = model;
    }
    public void greet(){
        System.out.println("Phone");
    }

    @Override
    public int compareTo(Phone o) {
        return this.model.compareTo(o.model);
    }
}
