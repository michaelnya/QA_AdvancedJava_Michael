/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.pkg29.pkg10.pkg19;

import com.qa.interfaces.Address;
import com.qa.interfaces.Printable;
import com.qa.domain.Circle;
import com.qa.domain.Printer;
import com.qa.domain.Shape;
import com.qa.domain.ShapeException;
import com.qa.domain.Triangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Collections291019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ShapeException {
        // TODO code application logic here
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {

            numbers[i] = (int) (Math.random() * 100);
        }

        List<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(8);

        double sum = 0;
        for (Integer o : scores) {
            sum += o;
        }
        System.out.println(sum);

        printCircles();

        //Collections291019.<String,Integer>process(args, 5);
        Printable address = new Address("122 Egales Rest", "Lower Zambezi", "10101");
        Printer.doPrint(address);

        Printable triangle = (Printable) new Triangle(5, 7, 5);
        Printer.doPrint(address);
        
        sortShapes();
    }

    private static void printCircles() {
        List<Circle> myCircles = new ArrayList<>();

////    myCircles.add(new Circle(35));
////        while (true) {
////            System.out.println();
//            
    }

    private static void sortShapes() throws ShapeException {


        List<Shape> triangles = new ArrayList<>();

        triangles.add(new Triangle(4, 3, 5));
        triangles.add(new Triangle(40, 30, 50));

        Collections.sort(triangles);

        triangles.forEach((t) -> {
            System.out.println(t);
        });
    }
}
