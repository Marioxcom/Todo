import java.util.ArrayList;
import java.util.Scanner;

public class newMain{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> listUser = new ArrayList<>();
        String user1 = "ID: " + "1" + ", Name: " + "Steven" + ", Email: " + "steven@gmail.com";
        String user2 = "ID: " + "2" + ", Name: " + "Marcos" + ", Email: " + "marcos@gmail.com";
        String user3 = "ID: " + "3" + ", Name: " + "Luis" + ", Email: " + "luis@gmail.com";
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);

        ArrayList<String> listSongs = new ArrayList<>();

        listSongs.add(new String("ID: " + "1" + ", Name: " + "Tierrita Mojada" + ", artist: " + "EdMaverick" + ", duration: " + 1.31 + ", genre: " + "Indie"));
        listSongs.add(new String("ID: " + "2" + ", Name: " + "Amarte" + ", artist: " + "KeevinKarl" + ", duration: " + 2.05 + ", genre: " + "Indie"));
        listSongs.add(new String("ID: " + "3" + ", Name: " + "Canela" + ", artist: " + "MiSobrinoMemo" + ", duration: " + 3.00 + ", genre: " + "Indie"));
        listSongs.add(new String("ID: " + "4" + ", Name: " + "November Rain" + ", artist: " + "GunsRoses" + ", duration: " + 1.55 + ", genre: " + "Rock"));
        listSongs.add(new String("ID: " + "5" + ", Name: " + "Creep" + ", artist: " + "RadioHead: " + ", duration: " + 2.45 + ", genre: " + "Rock"));
        listSongs.add(new String("ID: " + "6" + ", Name: " + "Lithium" + ", artist: " + "Nirvana" + ", duration: " + 3.21 + ", genre: " + "Rock"));


        boolean runningMain = true;
        boolean runningUser = true;
        boolean runingSong = true;


        //Variables User
        String userId = "";
        String userName = "";
        String userEmail = "";

        //Variables Song
        String idSong = "";
        String nameSong = "";
        String artist = "";
        String genre = "";
        double duration = 0;


        System.out.println("================Inicio App Music Manager==========");
        System.out.println("""
                1.Acceder a User Menu
                2.Acceder a User Song
                3. Exit
                """);

        while (runningMain) {
            System.out.print("Choose an option: ");
            int optionMain = input.nextInt();
            if (optionMain == 1) {
                runningUser = true;
            }
            switch (optionMain) {
                case 1:
                    while (runningUser) {
                        System.out.println("-----USER MENU-----\n" +
                                "1. Create user\n" +
                                "2. Show users\n" +
                                "3. Update user\n" +
                                "4. Delete user\n" +
                                "5. Exit");
                        System.out.print("Choose an option: ");
                        int option = input.nextInt();
                        input.nextLine();

                        switch (option) {
                            case 1:
                                boolean validInput = false;
                                while (!validInput) {
                                    try {
                                        // Create User
                                        System.out.print("Enter user ID: ");
                                        userId = input.nextLine();

                                        System.out.print("Enter user Name: ");
                                        userName = input.nextLine();

                                        System.out.print("Enter user Email: ");
                                        userEmail = input.nextLine();

                                        //Excepciones
                                        if (userEmail.isBlank() || userName.isBlank() || userId.isBlank()) {
                                            throw new IllegalArgumentException("Email cannot be empty.");
                                        }
                                        if (!userEmail.contains("@")) {
                                            throw new IllegalArgumentException("Please insert a valid email address");
                                        }
                                        if (!userEmail.endsWith(".com") && !userEmail.endsWith(".es")) {
                                            throw new IllegalArgumentException("Please insert a valid email address");
                                        }
                                        validInput = true;

                                        // Almacenar los datos del usuario
                                        String user = "ID: " + userId + ", Name: " + userName + ", Email: " + userEmail;
                                        listUser.add(user);
                                        System.out.println("User created successfully!");

                                    } catch (IllegalArgumentException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                break;

                            case 2:
                                // Mostrar usuarios
                                if (listSongs.isEmpty()) {
                                    System.out.println("No users available.");
                                } else {
                                    System.out.println("List of users:");
                                    for (String userIndex : listUser) {
                                        System.out.println(userIndex);
                                    }
                                }
                                break;

                            case 3: // Update User
                                boolean validInput2 = false;
                                while (!validInput2) {
                                    try {


                                        boolean found = false;
                                        System.out.print("Enter the user ID to update: ");
                                        String updateId = input.nextLine();
                                        for (int i = 0; i < listUser.size(); i++) {
                                            if (listUser.get(i).contains(updateId)) {
                                                found = true;
                                                System.out.println("Actual information :" + listUser.get(i));
                                                System.out.print("Enter new Name: ");
                                                String newName = input.nextLine();
                                                System.out.print("Enter new Email: ");
                                                String newEmail = input.nextLine();

                                                //Excepciones
                                                if (newEmail.isBlank() || newName.isBlank()) {
                                                    throw new IllegalArgumentException("Email cannot be empty.");
                                                }
                                                if (!newEmail.contains("@")) {
                                                    throw new IllegalArgumentException("Please insert a valid email address");
                                                }
                                                if (!newEmail.endsWith(".com") || !newEmail.endsWith(".es") || !newEmail.endsWith(".cat") || !newEmail.endsWith(".org")) {
                                                    throw new IllegalArgumentException("Please insert a valid email address");
                                                }

                                                // Actualizar los datos del usuario
                                                listUser.set(i, "ID: " + updateId + ", Name: " + newName + ", Email: " + newEmail);
                                                System.out.println("User updated successfully!");
                                                break;
                                            }
                                        }
                                                if (!found) {
                                            System.out.println("User not found.");}

                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                // Eliminar un usuario
                                System.out.print("Enter the user ID to delete: ");
                                String deleteId = input.nextLine();

                                boolean deleted = false;
                                for (int i = 0; i < listUser.size(); i++) {
                                    if (listUser.get(i).contains(deleteId)) {
                                        listUser.remove(i);
                                        System.out.println("User deleted successfully!");
                                        deleted = true;
                                        break;
                                    }
                                }
                                if (!deleted) {
                                    System.out.println("User not found.");
                                }
                                break;

                            case 5:
                                System.out.println("Exiting program...");
                                runningUser = false;
                                break;

                            default:
                                System.out.println("Invalid option, please try again.");
                        }
                    }
                    System.out.println("================Inicio App Music Manager==========");
                    System.out.println("""
                            1.Acceder a User Menu
                            2.Acceder a User Song
                            3. Exit
                            """);
                    break;
                case 2:
                    while (runingSong) {
                        System.out.println("-----SONG MENU-----\n" +
                                "1. Create song\n" +
                                "2. Show songs\n" +
                                "3. Update song\n" +
                                "4. Delete song\n" +
                                "5. Exit");
                        System.out.print("Choose an option: ");
                        int option = input.nextInt();
                        input.nextLine();

                        switch (option) {
                            case 1:// Crear Canción
                                System.out.print("Enter song ID: ");
                                idSong = input.nextLine();

                                System.out.print("Enter song Name: ");
                                nameSong = input.nextLine();

                                System.out.print("Enter song Artist: ");
                                artist = input.nextLine();

                                System.out.print("Enter the song genre: ");
                                genre = input.nextLine();

                                System.out.print("Enter the song duration in minutes: ");
                                duration = input.nextDouble();


                                // Almacenar los un conjunto de datos de un Song
                                String formattedDuration = String.format("%.2f", duration);
                                String song = "ID: " + idSong + ", Name: " + nameSong + ", Artist: " + artist + ", Duration: " + formattedDuration + ", genre: " + genre;
                                listSongs.add(song);
                                System.out.println("Song created successfully!");
                                break;

                            case 2:// Show Songs
                                if (listSongs.isEmpty()) {
                                    System.out.println("No songs available.");
                                } else {
                                    System.out.println("List of songs:");
                                    for (String songIndex : listSongs) {
                                        System.out.println(songIndex);
                                    }
                                }
                                break;

                            case 3:// Actualizar un Cancion
                                System.out.print("Enter the song to update: ");
                                String updateIdSong = input.nextLine();

                                boolean found = false;
                                for (int i = 0; i < listSongs.size(); i++) {
                                    if (listSongs.get(i).contains(updateIdSong)) {
                                        found = true;
                                        System.out.print("Actual information :" + listSongs.get(i));

                                        System.out.print("Enter new Name: ");
                                        String newNameSong = input.nextLine();

                                        System.out.print("Enter new Artist: ");
                                        String newArtist = input.nextLine();

                                        System.out.print("Enter the new song genre: ");
                                        String newgenre = input.nextLine();

                                        System.out.print("Enter the new song duration in minutes: ");
                                        double newDuration = input.nextDouble();

                                        // Actualizar los datos del usuario
                                        String formattedNewDuration = String.format("%.2f", newDuration);
                                        listSongs.set(i, "ID: " + updateIdSong + ", Name: " + newNameSong + ", Artist: " + newArtist + ", Duration: " + formattedNewDuration + ", genre: " + newgenre);
                                        System.out.println("Song updated successfully!");
                                        break;
                                    }
                                }
                                if (!found) {
                                    System.out.println("User not found.");
                                }
                                break;

                            case 4: // Delete song
                                System.out.print("Enter the Song to delete: ");
                                String deleteSongId = input.nextLine();

                                boolean deleted = false;
                                for (int i = 0; i < listSongs.size(); i++) {
                                    if (listSongs.get(i).contains(deleteSongId)) {
                                        listSongs.remove(i);
                                        System.out.println("Song deleted successfully!");
                                        deleted = true;
                                        break;
                                    }
                                }
                                if (!deleted) {
                                    System.out.println("Song not found.");
                                }
                                break;

                            case 5:
                                System.out.println("Exiting Song Menu...");
                                runingSong = false;
                                break;

                            default:
                                System.out.println("Invalid option, please try again.");
                        }
                    }
                    System.out.println("================Inicio App Music Manager==========");
                    System.out.println("""
                            1.Acceder a User Menu
                            2.Acceder a User Song
                            3. Exit
                            """);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    runningMain = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    System.out.println("""
                            1. Acceder a User Menu
                            2. Acceder a Song Menu
                            3. Exit
                            """);
            }
        }
        input.close();
    }
}