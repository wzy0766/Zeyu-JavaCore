package Homework1;

import java.io.Serializable;

/**
 * Problems: Define a “Employee” POJO class and make it serializable
 */
public class Serializable {

    public static class Employee implements Serializable {

        private static final long serialVersionUID = 1L;

        private int id;
        private String name;

        public Employee(){}
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}