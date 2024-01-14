class Employee {
    private int nik;
    private String username;
    private String password;
    private String name;
    private String address;
    private String gender;
    private String religion;
    private String education;
    private String school;
    private String position;
    private int gaji;

    // Constructor
    public Employee(int nik, String username, String password, String name, String address, String gender,
                    String religion, String education, String school, String position, int gaji) {
        this.nik = nik;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.religion = religion;
        this.education = education;
        this.school = school;
        this.position = position;
        this.gaji = gaji;
    }

    // Getters
    public int getNik() {
        return nik;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getReligion() {
        return religion;
    }

    public String getEducation() {
        return education;
    }

    public String getSchool() {
        return school;
    }

    public String getPosition() {
        return position;
    }

    public int getGaji() {
        return gaji;
    }
}