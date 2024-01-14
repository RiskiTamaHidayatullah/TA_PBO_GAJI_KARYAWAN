import java.util.Scanner;

class EmployeeManagement {
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK: ");
        int nik = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("Alamat: ");
        String address = scanner.nextLine();

        System.out.print("Jenis Kelamin: ");
        String gender = scanner.nextLine();

        System.out.print("Agama: ");
        String religion = scanner.nextLine();

        System.out.print("Pendidikan: ");
        String education = scanner.nextLine();

        System.out.print("Asal Sekolah: ");
        String school = scanner.nextLine();

        System.out.print("Posisi: ");
        String position = scanner.nextLine();

        System.out.print("Gaji: ");
        int gaji = scanner.nextInt();

        Employee employee = new Employee(nik, username, password, name, address, gender, religion,
                education, school, position, gaji);

        System.out.println("Penggajihan sukses.");

        scanner.close();
    }
}