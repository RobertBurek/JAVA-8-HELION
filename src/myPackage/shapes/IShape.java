package myPackage.shapes;

/**
 * Created by Robert Burek
 */
public interface IShape {
    default int countArea(){
        return 0;
    }

    int countPerimeter();


}
