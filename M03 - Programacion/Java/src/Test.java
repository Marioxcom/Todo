import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumne alumne1 = new Alumne("Mario", "Marin", 18, "54559465S");
        Alumne alumne2 = new Alumne("Alex", "Serrano", 19, "65789804C");
        Modul modul1 = new Modul("Programació");
        Modul modul2 = new Modul("Base de Dades");
        Modul modul3 = new Modul("Git & Github");
        // Matricules Mario
        Matricula matricula11 = new Matricula(alumne1, modul1, 6);
        Matricula matricula12 = new Matricula(alumne1, modul2, 7);
        Matricula matricula13 = new Matricula(alumne1, modul3, 3);
        // Matricules Alex
        Matricula matricula21 = new Matricula(alumne2, modul1, 4);
        Matricula matricula22 = new Matricula(alumne2, modul2, 6);
        Matricula matricula23 = new Matricula(alumne2, modul3, 9);

        System.out.print("Introdueix un DNI: ");
        String agregarDni = sc.nextLine();

        if (agregarDni.equals(alumne1.getDni()) || agregarDni.equals(alumne2.getDni())) {

        }

    }
}
