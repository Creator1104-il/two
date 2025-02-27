import java.util.Scanner;
class Patient {
    String lastName;
    String firstName;
    String middleName;
    String address;
    String medicalCardNumber;
    String diagnosis;
    public Patient(String lastName, String firstName, String middleName, String address,
                   String medicalCardNumber, String diagnosis) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }
    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", Адрес: " + address +
                ", Номер мед. карты: " + medicalCardNumber + ", Диагноз: " + diagnosis;
    }
}
public class Main {
    public static void main(String[] args) {
        Patient[] patients = new Patient[3];
        patients[0] = new Patient("Иванов", "Иван", "Иванович", "Москва, ул. Пушкина, д. 1",
                "123456", "грипп");
        patients[1] = new Patient("Петров", "Петр", "Петрович", "Москва, ул. Лермонтова, д. 2",
                "654321", "ОРВИ");
        patients[2] = new Patient("Сидоров", "Сидор", "Сидорович", "Москва, ул. Чехова, д. 3",
                "112233", "грипп");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диагноз для поиска пациентов: ");
        String filterDiagnosis = scanner.nextLine();
        System.out.println("Пациенты с диагнозом \"" + filterDiagnosis + "\":");
        int count = 0;
        for (Patient patient : patients)
            if (patient.diagnosis == filterDiagnosis) {
                System.out.println(patient);
                count++;

            }if (count == 0) {
                System.out.println("Пациенты с указанным диагнозом не найдены.");
            }
    }
}