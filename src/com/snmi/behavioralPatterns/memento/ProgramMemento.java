package com.snmi.behavioralPatterns.memento;

/**
 * The program implement the Memento design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramMemento {

    /**
     * Constants
     */
    private static final String BEFORE_SAVE = "Employee before save: %s";
    private static final String AFTER_SAVE = "Employee after changed phone number save: %s";
    private static final String FROM_LAST_SAVE = "Revert employee from last save: %s";
    private static final String FROM_FIRST_SAVE = "Revert to original: %s";

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee("Stefan", "Mandradzhiyski", "0897777777");
        System.out.printf(BEFORE_SAVE, employee);
        System.out.println();
        caretaker.save(employee);

        employee.setPhone("0898888888");
        caretaker.save(employee);
        System.out.printf(AFTER_SAVE, employee);
        System.out.println();

        employee.setPhone("0899999999");
        caretaker.revert(employee);
        System.out.printf(FROM_LAST_SAVE, employee);
        System.out.println();

        caretaker.revert(employee);
        System.out.printf(FROM_FIRST_SAVE, employee);
        System.out.println();
    }

}
