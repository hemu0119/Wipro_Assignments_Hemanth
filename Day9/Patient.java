package Day9;
class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient)) return false;

        Patient p = (Patient) obj;
        return this.id == p.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}