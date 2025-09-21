class PatientNode {
    int id;
    String name;
    int severity;
    PatientNode next;

    public PatientNode(int id, String name, int severity) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.next = null;
    }
}

class PatientQueue {
    private PatientNode head;

    public void addPatient(int id, String name, int severity) {
        PatientNode newNode = new PatientNode(id, name, severity);

        if (head == null || severity > head.severity) {
            newNode.next = head;
            head = newNode;
            return;
        }

        PatientNode temp = head;
        while (temp.next != null && temp.next.severity >= severity) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public PatientNode treatPatient() {
        if (head == null) {
            System.out.println("No patients in queue!");
            return null;
        }
        PatientNode treated = head;
        head = head.next;
        System.out.println("Treated patient: " + treated.name + " (Severity " + treated.severity + ")");
        return treated;
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("\nCurrent Patient Queue:");
        PatientNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + " | Name: " + temp.name + " | Severity: " + temp.severity);
            temp = temp.next;
        }
    }
}

public class PROBLEM_3 {
    public static void main(String[] args) {
        PatientQueue queue = new PatientQueue();

        queue.addPatient(101, "Alice", 5);
        queue.addPatient(102, "Bob", 8);
        queue.addPatient(103, "Charlie", 3);
        queue.addPatient(104, "David", 10);
        queue.addPatient(105, "Eva", 6);
        queue.addPatient(106, "Frank", 8);
        queue.addPatient(107, "Grace", 2);
        queue.addPatient(108, "Hannah", 10);
        queue.addPatient(109, "Ivan", 7);
        queue.addPatient(110, "Jack", 5);

        queue.displayQueue();

        queue.treatPatient();
        queue.treatPatient();
        queue.treatPatient();

        queue.displayQueue();
    }
}
