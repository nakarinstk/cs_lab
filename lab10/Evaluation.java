interface Evaluation {
    public double evaluate();

    public char grade(double i);
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "salary = " + this.salary;
    }
}

class Secretary extends Employee implements Evaluation {
    private int typingSpeed;
    private int score[];
    private double totalScore;

    public Secretary(String name, int salary, int score[], int typingSpeed) {
        super(name, salary);
        this.typingSpeed = typingSpeed;
        this.score = score;
    }

    public double evaluate() {
        totalScore = 0;
        for (int intScore : score) {
            totalScore += intScore;
        }
        return totalScore;
    }

    public char grade(double totalScore) {
        if (totalScore >= 90) {
            this.setSalary(18000);
            return 'P';
        }
        return 'F';
    }

}

class Subject implements Evaluation {
    private String subjName;
    private int[] score;

    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }

    public double evaluate() {
        double avg = 0;
        for (int studentScore : score) {
            avg += studentScore;
        }
        avg /= score.length;
        return avg;
    }

    public char grade(double given) {
        return given >= 70 ? 'P' : 'F';
    }

    public String toString() {
        return this.subjName;
    }
}