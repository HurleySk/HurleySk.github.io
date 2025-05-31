public class Project4 {
    public static void main(String[] args) {
        Student testStudent = new Student("edgar t. craphead", 17, 2.2);
        System.out.println(testStudent.getName());
        testStudent.setName("dog shit head");
        System.out.println(testStudent.getName());
    }
}

class Student {
    private Name name;
    private int age;
    private double gpa;

    //Constructor for when name entered as string
    Student(String name, int age, double gpa) {
        this(new Name(name), age, gpa);
    }

    //Full constructor
    Student(Name name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    //Get name
    public String getName() {
        return this.name.getName();
    }

    //Set name
    public void setName(String newName) {
        this.name.setName(newName);
    }

    //Get age
    public int getAge() {
        return this.age;
    }

    //Set age
    public void setAge(int newAge) {
        this.age = newAge;
    }

    //Get gpa
    public double getGpa() {
        return this.gpa;
    }

    //Set gpa
    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

}

class seatingChart {
    private Student[][] chart;
    private Student placeholderStudent = new Student(new Name("PLACEHOLDER", "", ""), -1, -1);

    //Default constructor
    seatingChart()

    //Full constructor
    seatingChart(int rows, int columns) {
        this.chart = new Student[rows][columns];
    }
}

//Name class for some more structure and to practice a few concepts
class Name {
    //Name attributes
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;

    //Constructor for when fullName passed
    Name(String fullName) {
        this.setName(fullName);
    }

    //Constructor for when no Middle Name passed
    Name(String firstName, String lastName) {
        this(firstName, "", lastName);
    }

    //Full constructor
    Name(String firstName, String middleName, String lastName) {
        this.setName(firstName, middleName, lastName);
    }

    public String getName() {
        return this.fullName;
    }

    //Method for setting name with first, middle, last
    public void setName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        if (middleName.isEmpty()) {
            this.fullName = this.firstName + " " + this.lastName;
        } else {
            this.fullName = this.firstName + " " + this.middleName + " " + this.lastName;
        }
    }

    //Setter for when fullName passed
    public void setName(String fullName) {
        String firstName = "";
        String secondName = "";
        String thirdName = "";
        int lastSpace = 0;
        int countOfSpaces = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if(fullName.charAt(i) == " ".charAt(0) && i != fullName.length() - 1) {
                if (countOfSpaces == 0) {
                    firstName = fullName.substring(0, i);
                } else if (countOfSpaces == 1) {
                    secondName = fullName.substring(lastSpace + 1, i);
                    thirdName = fullName.substring(i + 1, fullName.length());
                }
                lastSpace = i;
                countOfSpaces++;
            }
            else if (i == fullName.length() - 1) {
                if (countOfSpaces > 2) {
                    throw new IllegalArgumentException("Please provide a full name with, at most, two spaces where the spaces delineate between first, middle, and last name.");
                } else if (countOfSpaces == 1) {
                    secondName = fullName.substring(lastSpace + 1, fullName.trim().length());
                    this.setName(firstName, "", secondName);
                } else {
                    this.setName(firstName, secondName, thirdName);
                }
            }
        }
    }

}