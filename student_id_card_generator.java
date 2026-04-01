import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class student_id_card_generator {
    
    static class Student {
        private String id;
        private String name;
        private String department;
        private LocalDate enrollmentDate;
        private String photoPath;
        
        public Student(String id, String name, String department, LocalDate enrollmentDate, String photoPath) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.enrollmentDate = enrollmentDate;
            this.photoPath = photoPath;
        }
        
        public void displayCard() {
            System.out.println("╔════════════════════════════════╗");
            System.out.println("║      STUDENT ID CARD           ║");
            System.out.println("╠════════════════════════════════╣");
            System.out.println("║ ID: " + String.format("%-24s", id) + "║");
            System.out.println("║ Name: " + String.format("%-22s", name) + "║");
            System.out.println("║ Department: " + String.format("%-16s", department) + "║");
            System.out.println("║ Enrollment: " + String.format("%-16s", enrollmentDate) + "║");
            System.out.println("║ Photo: " + String.format("%-22s", photoPath) + "║");
            System.out.println("╚════════════════════════════════╝");
        }
        
        public String getCardInfo() {
            return String.format("ID: %s | Name: %s | Department: %s | Enrollment: %s",
                    id, name, department, enrollmentDate);
        }
    }
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        // Add sample students
        students.add(new Student("STU001", "John Doe", "Computer Science", LocalDate.of(2023, 9, 1), "photo1.jpg"));
        students.add(new Student("STU002", "Jane Smith", "Engineering", LocalDate.of(2023, 9, 1), "photo2.jpg"));
        students.add(new Student("STU003", "Mike Johnson", "Business", LocalDate.of(2023, 9, 1), "photo3.jpg"));
        
        // Display all student ID cards
        System.out.println("\n=== STUDENT ID CARD GENERATION SYSTEM ===\n");
        for (Student student : students) {
            student.displayCard();
            System.out.println();
        }
    }
}
