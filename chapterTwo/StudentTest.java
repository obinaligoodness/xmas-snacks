package chapterTwo;

public class StudentTest {
    public static void main(String[] args) {
        Student myStudent1 = new Student ("Dammy krane",96.2);
        Student myStudent2 = new Student ("Hussein Musa",50);

      System.out.printf("%s Your letter grade is: %s%n",myStudent1.getName(),myStudent1.getLetterGrade());
      System.out.printf("%s Your letter grade is: %s",myStudent2.getName(),myStudent2.getLetterGrade());
    }

}
