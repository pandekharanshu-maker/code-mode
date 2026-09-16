import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// ===================== Abstract Base Class =====================

abstract class HospitalMember {
    private String name;
    private int age;
    private String contactNumber;

    public HospitalMember(String name, int age, String contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public abstract void displayDetails();
}

// ===================== Doctor Class =====================

class Doctor extends HospitalMember {
    private static int doctorCounter = 100;
    private final int doctorId;
    private String specialization;
    private String department;

    public Doctor(String name, int age, String contactNumber,
                  String specialization, String department) {
        super(name, age, contactNumber);
        this.doctorId = ++doctorCounter;
        this.specialization = specialization;
        this.department = department;
    }

    public int getDoctorId() { return doctorId; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public void displayDetails() {
        System.out.println("---------------------------------------");
        System.out.println("Doctor ID        : " + doctorId);
        System.out.println("Name             : Dr. " + getName());
        System.out.println("Age              : " + getAge());
        System.out.println("Contact Number   : " + getContactNumber());
        System.out.println("Specialization   : " + specialization);
        System.out.println("Department       : " + department);
        System.out.println("---------------------------------------");
    }

    @Override
    public String toString() {
        return "Dr. " + getName() + " (" + specialization + ")";
    }
}

// ===================== Patient Class =====================

class Patient extends HospitalMember {
    private static int patientCounter = 0;
    private final int patientId;
    private String bloodGroup;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String department;
    private Doctor attendingDoctor;
    private boolean isDischarged;

    private static final double DAILY_ROOM_CHARGE   = 1500.0;
    private static final double CONSULTATION_CHARGE = 800.0;

    public Patient(String name, int age, String contactNumber,
                   String bloodGroup, String department,
                   Doctor attendingDoctor) {
        super(name, age, contactNumber);
        this.patientId       = ++patientCounter;
        this.bloodGroup      = bloodGroup;
        this.department      = department;
        this.attendingDoctor = attendingDoctor;
        this.admissionDate   = LocalDate.now();
        this.dischargeDate   = null;
        this.isDischarged    = false;
    }

    public int getPatientId() { return patientId; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public Doctor getAttendingDoctor() { return attendingDoctor; }
    public void setAttendingDoctor(Doctor attendingDoctor) { this.attendingDoctor = attendingDoctor; }

    public boolean isDischarged() { return isDischarged; }

    public LocalDate getAdmissionDate() { return admissionDate; }
    public LocalDate getDischargeDate() { return dischargeDate; }

    public void discharge() {
        this.dischargeDate = LocalDate.now();
        this.isDischarged  = true;
    }

    public long getStayDuration() {
        LocalDate endDate = (dischargeDate != null) ? dischargeDate : LocalDate.now();
        long days = ChronoUnit.DAYS.between(admissionDate, endDate);
        return Math.max(days, 1);
    }

    public double calculateBill() {
        return (getStayDuration() * DAILY_ROOM_CHARGE) + CONSULTATION_CHARGE;
    }

    @Override
    public void displayDetails() {
        System.out.println("---------------------------------------");
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Name             : " + getName());
        System.out.println("Age              : " + getAge());
        System.out.println("Contact Number   : " + getContactNumber());
        System.out.println("Blood Group      : " + bloodGroup);
        System.out.println("Department       : " + department);
        System.out.println("Attending Doctor : "
                + (attendingDoctor != null ? attendingDoctor.toString() : "Not Assigned"));
        System.out.println("Admission Date   : " + admissionDate);
        System.out.println("Discharge Date   : "
                + (dischargeDate != null ? dischargeDate.toString() : "Still Admitted"));
        System.out.println("Status           : "
                + (isDischarged ? "Discharged" : "Admitted"));
        System.out.printf("Bill (so far)    : Rs. %.2f%n", calculateBill());
        System.out.println("---------------------------------------");
    }
}

// ===================== RecordManager Interface =====================

interface RecordManager<T> {
    void add(T item);
    void viewAll();
    T searchById(int id);
    boolean deleteById(int id);
}

// ===================== Hospital Management System =====================

class HospitalManagementSystem implements RecordManager<Patient> {

    private List<Patient> patients = new ArrayList<>();
    private List<Doctor>  doctors  = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // ---------- RecordManager Implementation ----------

    @Override
    public void add(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void viewAll() {
        if (patients.isEmpty()) {
            System.out.println("No patient records found.");
            return;
        }
        for (Patient patient : patients) {
            patient.displayDetails();
        }
    }

    @Override
    public Patient searchById(int id) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == id) {
                return patient;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return patients.removeIf(patient -> patient.getPatientId() == id);
    }

    // ---------- Doctor Management ----------

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void viewAllDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctor records found.");
            return;
        }
        for (Doctor doctor : doctors) {
            doctor.displayDetails();
        }
    }

    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == id) {
                return doctor;
            }
        }
        return null;
    }

    // ---------- Search ----------

    public List<Patient> searchByName(String name) {
        List<Patient> results = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                results.add(patient);
            }
        }
        return results;
    }

    public void displayAllHospitalMembers() {
        List<HospitalMember> members = new ArrayList<>();
        members.addAll(doctors);
        members.addAll(patients);

        if (members.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (HospitalMember member : members) {
            member.displayDetails();
        }
    }

    // ---------- Input Helpers ----------

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    private String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    // ---------- Handler Methods ----------

    private void handleAddPatient() {
        String name      = readLine("Enter patient name: ");
        int    age       = readInt("Enter patient age: ");
        String contact   = readLine("Enter contact number: ");
        String bloodGroup = readLine("Enter blood group: ");
        String department = readLine("Enter department: ");

        Doctor assignedDoctor = null;

        if (!doctors.isEmpty()) {
            viewAllDoctors();
            int doctorId = readInt("Enter Doctor ID to assign (0 for none): ");
            if (doctorId != 0) {
                assignedDoctor = findDoctorById(doctorId);
                if (assignedDoctor == null) {
                    System.out.println("Doctor not found. Patient will remain unassigned.");
                }
            }
        } else {
            System.out.println("No doctors registered yet. Patient will be unassigned.");
        }

        Patient patient = new Patient(name, age, contact, bloodGroup, department, assignedDoctor);
        add(patient);
        System.out.println("Patient admitted successfully. ID: " + patient.getPatientId());
    }

    private void handleAddDoctor() {
        String name           = readLine("Enter doctor name: ");
        int    age            = readInt("Enter doctor age: ");
        String contact        = readLine("Enter contact number: ");
        String specialization = readLine("Enter specialization: ");
        String department     = readLine("Enter department: ");

        Doctor doctor = new Doctor(name, age, contact, specialization, department);
        addDoctor(doctor);
        System.out.println("Doctor registered successfully. ID: " + doctor.getDoctorId());
    }

    private void handleSearchById() {
        int id = readInt("Enter Patient ID to search: ");
        Patient patient = searchById(id);

        if (patient != null) {
            patient.displayDetails();
        } else {
            System.out.println("No patient found with ID " + id);
        }
    }

    private void handleSearchByName() {
        String name = readLine("Enter patient name to search: ");
        List<Patient> results = searchByName(name);

        if (results.isEmpty()) {
            System.out.println("No patient found with name \"" + name + "\".");
        } else {
            for (Patient patient : results) {
                patient.displayDetails();
            }
        }
    }

    private void handleUpdatePatient() {
        int id = readInt("Enter Patient ID to update: ");
        Patient patient = searchById(id);

        if (patient == null) {
            System.out.println("No patient found with ID " + id);
            return;
        }

        System.out.println("Leave blank to keep the current value.");

        String name = readLine("New name [" + patient.getName() + "]: ");
        if (!name.isEmpty()) patient.setName(name);

        String contact = readLine("New contact number [" + patient.getContactNumber() + "]: ");
        if (!contact.isEmpty()) patient.setContactNumber(contact);

        String bloodGroup = readLine("New blood group [" + patient.getBloodGroup() + "]: ");
        if (!bloodGroup.isEmpty()) patient.setBloodGroup(bloodGroup);

        String department = readLine("New department [" + patient.getDepartment() + "]: ");
        if (!department.isEmpty()) patient.setDepartment(department);

        System.out.println("Patient details updated successfully.");
    }

    private void handleDischargePatient() {
        int id = readInt("Enter Patient ID to discharge: ");
        Patient patient = searchById(id);

        if (patient == null) {
            System.out.println("No patient found with ID " + id);
            return;
        }

        if (patient.isDischarged()) {
            System.out.println("Patient is already discharged.");
            return;
        }

        patient.discharge();
        System.out.printf("Patient discharged. Total bill: Rs. %.2f%n", patient.calculateBill());
    }

    private void handleDeletePatient() {
        int id = readInt("Enter Patient ID to delete: ");
        boolean removed = deleteById(id);
        System.out.println(removed
                ? "Patient record deleted."
                : "No patient found with ID " + id);
    }

    private void handleGenerateBill() {
        int id = readInt("Enter Patient ID to generate bill: ");
        Patient patient = searchById(id);

        if (patient == null) {
            System.out.println("No patient found with ID " + id);
            return;
        }

        System.out.println("---------------------------------------");
        System.out.println("Billing summary for : " + patient.getName());
        System.out.println("Patient ID          : " + patient.getPatientId());
        System.out.println("Department          : " + patient.getDepartment());
        System.out.println("Days admitted       : " + patient.getStayDuration());
        System.out.printf("Room charges        : Rs. %.2f%n",
                patient.getStayDuration() * 1500.0);
        System.out.printf("Consultation charge : Rs. %.2f%n", 800.0);
        System.out.printf("Total bill amount   : Rs. %.2f%n", patient.calculateBill());
        System.out.println("---------------------------------------");
    }

    // ---------- Seed Data ----------

    public void seedSampleData() {
        Doctor d1 = new Doctor("Sharma", 45, "9990000001", "Cardiologist",    "Cardiology");
        Doctor d2 = new Doctor("Verma",  50, "9990000002", "Neurologist",     "Neurology");
        Doctor d3 = new Doctor("Gupta",  40, "9990000003", "Orthopedic Surgeon", "Orthopedics");

        addDoctor(d1);
        addDoctor(d2);
        addDoctor(d3);

        add(new Patient("Karan", 22, "9998880001", "A+",  "Cardiology",   d1));
        add(new Patient("Kavya", 25, "9998880002", "B+",  "Neurology",    d2));
        add(new Patient("Kunal", 23, "9998880003", "AB+", "Orthopedics",  d3));
    }

    // ---------- Menu ----------

    private void printMenu() {
        System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
        System.out.println("1.  Admit New Patient");
        System.out.println("2.  View All Patients");
        System.out.println("3.  Search Patient by ID");
        System.out.println("4.  Search Patient by Name");
        System.out.println("5.  Update Patient Details");
        System.out.println("6.  Discharge Patient");
        System.out.println("7.  Delete Patient Record");
        System.out.println("8.  Register New Doctor");
        System.out.println("9.  View All Doctors");
        System.out.println("10. Generate Patient Bill");
        System.out.println("11. View All Hospital Members");
        System.out.println("0.  Exit");
        System.out.println("=======================================");
    }

    public void run() {
        seedSampleData();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:  handleAddPatient();          break;
                case 2:  viewAll();                   break;
                case 3:  handleSearchById();          break;
                case 4:  handleSearchByName();        break;
                case 5:  handleUpdatePatient();       break;
                case 6:  handleDischargePatient();    break;
                case 7:  handleDeletePatient();       break;
                case 8:  handleAddDoctor();           break;
                case 9:  viewAllDoctors();            break;
                case 10: handleGenerateBill();        break;
                case 11: displayAllHospitalMembers(); break;
                case 0:
                    running = false;
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}

// ===================== Main Entry Point =====================

public class Hospital {
    public static void main(String[] args) {
        HospitalManagementSystem hms = new HospitalManagementSystem();
        hms.run();
    }
}