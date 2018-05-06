package org.stepik.topstepikcourses;

public class Main {

    public static void main(String[] args) {
        if (argsValid(args)) {
            StepikCourseStatistic stepikCourseStatistic = new StepikCourseStatistic();
            stepikCourseStatistic.printTopCourses(Integer.parseInt(args[0]));
        }
    }

    private static boolean argsValid(String[] args) {
        if (args.length <= 0) {
            System.out.println("Number of top courses not provided.");
            return false;
        }

        try {
            Integer numberOfTopCourses = Integer.parseInt(args[0]);
            if (numberOfTopCourses <= 0) {
                System.out.println("Parameter passed less or equals zero, nothing to retrieve.");
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal parameter format.");
            return false;
        }
    }
}
