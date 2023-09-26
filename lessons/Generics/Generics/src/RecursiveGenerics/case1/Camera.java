package RecursiveGenerics.case1;

public class Camera extends Product<Camera> {
    Integer pixel;

    public Camera(int pixel){
        super(45);
        this.pixel = pixel;
    }
    public void greet(){
        System.out.println("Camera");
    }

    @Override
    public int compareTo(Camera o) {
        return this.pixel.compareTo(o.pixel);
    }
}
