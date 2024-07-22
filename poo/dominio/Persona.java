package poo.dominio;

public class Persona {
    //Atributos y metodos (responsabilidades)
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    //Relaciones
    private Auto auto;


    //Constructor vacio
    public Persona() {}

    //Constructor completo
    public Persona(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, int dni, int edad, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String apellido){
        this.apellido = apellido;
    }

    //[clasificador] [tipoDeRetorno] nombreDelMetodo([<expresiones>])){}

    //Setters para guardar informacion
    public void setNombre(String nombre){
        //this es una forma de apuntar a atributos y metodos de la clase

        boolean esNombreValido = validarNombre(nombre);

        if (esNombreValido){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre invalido");
        }

    }

    private boolean validarNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            return false;
        }
        return true;
    }

    public void setApellido(String valor) {
        this.apellido = valor;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    //Getters para devolver informacion
    public String getNombre(){
        //Return devuelve algo
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public Auto getAuto() {
        return auto;
    }
}
