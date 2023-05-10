package joma;

import java.util.Arrays;

/**
 * @author Erfan Akhavan Rad
 * @created 05/10/2023
 */
public class JomaAlgorithms {

    public void print() {
        int i = 0;
        while (i < 200) {
            System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
            i++;
            System.out.println(i);
        }
    }

    public int[] distributeBonuses(int[] employeesPerformance) {
        int[] employeesBonuses = new int[employeesPerformance.length];

        for (int i = 0; i < employeesPerformance.length; i++) {
            if (employeesPerformance[i] == 1 || employeesPerformance[i] < employeesPerformance[i + 1] && employeesPerformance[i] < employeesPerformance[i - 1]) {
                employeesBonuses[i] = 1;
            } else {
                if (employeesPerformance[i] > employeesPerformance[i + 1] && employeesPerformance[i] > employeesPerformance[i - 1]) {
                    employeesBonuses[i] = 3;
                } else if (employeesPerformance[i] > employeesPerformance[i + 1] || employeesPerformance[i] > employeesPerformance[i - 1]) {
                    employeesBonuses[i] = 2;
                }
            }
        }
        return employeesBonuses;
    }

}
