package kata6;

public class Person1 {
    private final Integer id;
    private final String name, genero, fechaNacimiento, mail;
    private final float peso;

    public Person1(Integer id, String name, String genero, String fechaNacimiento, float peso, String mail) {
        this.id = id;
        this.name = name;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.mail = mail;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getMail() {
        return mail;
    }

    public float getPeso() {
        return peso;
    }
    
    
}
