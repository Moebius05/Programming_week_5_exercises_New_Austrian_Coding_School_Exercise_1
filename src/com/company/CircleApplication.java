/* In a new line, assign the circle variable to a Shape variable called shape.
           Just use the = symbol.
            Display the shape’s name.
           Create another Circle, but this time assign it directly to a Shape with the name anotherShape.
            Display anotherShape’s name.
             Create the CircleTest class that tests that the Circle is working correctly as both Circle and Shape.
              Class: circle
 */

package com.company;

public class CircleApplication {
    public static void main(String[] args) {
        Circle  newCircle       =   new Circle();
        System.out.println(newCircle.getName());

        Shape   shape           =   newCircle;
        System.out.println(shape.getName());

        Shape   anothershape    =   new Circle();
        System.out.println(anothershape.getName());
    }
}
