package com.course_2_solving_problems_w_software.perimeter;

import edu.duke.Point;
import edu.duke.Shape;
import edu.duke.FileResource;
import edu.duke.DirectoryResource;

import java.io.File;

/**
 * Get the perimeter of any shape (excluding circles)
 * **/
public class PerimeterAssignmentRunner {
    public double getPerimeter(Shape s) {
        double totalPerim = 0;
        Point prevPoint = s.getLastPoint();

        // Iterate around the perimeter
        for (Point currPoint: s.getPoints()) {
            double lengthSide = currPoint.distance(prevPoint);
            totalPerim += lengthSide;
            prevPoint = currPoint;
        }
        return totalPerim;
    }

    public int getNumPoints(Shape s) {
        int total_points = 0;
        for (Point ignored : s.getPoints()) {
            total_points += 1;
        }
        return total_points;
    }

    public double getAverageLength(Shape s) {
        int countPoints = this.getNumPoints(s);
        double perimeter = this.getPerimeter(s);
        return perimeter / countPoints;
    }

    public double getLargestSide(Shape s) {
        Point prevPoint = s.getLastPoint();
        double maxSideLength = 0;
        for (Point currPoint : s.getPoints()) {
            double length = currPoint.distance(prevPoint);
            if (length > maxSideLength) {
                maxSideLength = length;
            }
        }
        return maxSideLength;
    }

    public double getLargestX(Shape s) {
        Point prevPoint = s.getLastPoint();
        double maxX = 0;
        for (Point currPoint : s.getPoints()) {
            double x = currPoint.getX();
            if (x > maxX) {
                maxX = x;
            }
        }
        return maxX;
    }

    public double getLargestPerimeterMultipleFiles() {
        var fileDirectory = new DirectoryResource();
        var perimeterRunner = new PerimeterAssignmentRunner();
        double largestPerimeter = 0;
        for (File x : fileDirectory.selectedFiles()) {
            var file = new FileResource(x);
            var shape = new Shape(file);
            double perimeter = perimeterRunner.getPerimeter(shape);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
            }
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        var fileDirectory = new DirectoryResource();
        var perimeterRunner = new PerimeterAssignmentRunner();
        String largestPerimeterFileName = "";
        double largestPerimeter = 0;
        for (File x : fileDirectory.selectedFiles()) {
            var file = new FileResource(x);
            var shape = new Shape(file);
            double perimeter = perimeterRunner.getPerimeter(shape);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
                largestPerimeterFileName = x.getName();
            }
        }
        return largestPerimeterFileName;
    }

    public void testPerimeterMultipleFiles() {
        double largestPerimeter = this.getLargestPerimeterMultipleFiles();
        System.out.println("Largest perimeter: " + largestPerimeter);
    }

    public void testFileWithLargestPerimeter() {
        String largestPerimeterFileName = this.getFileWithLargestPerimeter();
        System.out.println("Largest perimeter filename: " + largestPerimeterFileName);
    }

    public void testPerimeter() {
        String fileName = "course_2_solving_problems_w_software/perimeter/datatest1.txt";
        FileResource file1 = new FileResource(fileName);
        var shape1 = new Shape(file1);
        System.out.println("Calculating for: " + fileName);
        System.out.println("Perimeter: "+ this.getPerimeter(shape1));
        System.out.println("Number of points: " + this.getNumPoints(shape1));
        System.out.println("the average length of a side in your shape is " + this.getAverageLength(shape1));
        System.out.println("The max side length is: " + this.getLargestSide(shape1));
        System.out.println("The max X value is: " + this.getLargestX(shape1));
    }

    public static void main(String[] args) {
        var perimeterRunner = new PerimeterAssignmentRunner();

        // Uncomment to run a test method.
        perimeterRunner.testPerimeter();
//        perimeterRunner.testPerimeterMultipleFiles();
//        perimeterRunner.testFileWithLargestPerimeter();

    }
}

