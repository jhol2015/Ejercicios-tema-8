package ejercicio8;

public class CallPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdade(20);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        System.out.println("Edad: " + persona.getEdade());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
