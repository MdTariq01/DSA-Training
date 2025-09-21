/* 
PROBLEM- 

You are required to develop a menu-driven Java program to manage a music playlist
using a singly linked list. Each node in the linked list should represent a song,
containing:
 String songTitle
 String artist
 int durationInSeconds
Your program should allow users to perform the following operations:

Functional Requirements (Menu Options):
1. Add song at the beginning of the playlist
2. Add song at the end of the playlist
3. Add song at a specific position
4. Delete song from beginning
5. Delete song from end
6. Delete song from specific position
7. Update song details at a given position (e.g., title or artist)
8. Display the entire playlist with song details
9. Exit

*/

import java.util.Scanner;

class SongNode {
    String songTitle;
    String artist;
    int durationInSeconds;
    SongNode next;

    public SongNode(String songTitle, String artist, int durationInSeconds) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.next = null;
    }
}

class Playlist {
    private SongNode head;

    // Add at beginning
    public void addAtBeginning(String title, String artist, int duration) {
        SongNode newNode = new SongNode(title, artist, duration);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(String title, String artist, int duration) {
        SongNode newNode = new SongNode(title, artist, duration);
        if (head == null) {
            head = newNode;
            return;
        }
        SongNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position
    public void addAtPosition(int position, String title, String artist, int duration) {
        if (position == 1) {
            addAtBeginning(title, artist, duration);
            return;
        }
        SongNode newNode = new SongNode(title, artist, duration);
        SongNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("Playlist is empty!");
            return;
        }
        head = head.next;
    }

    // Delete from end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("Playlist is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        SongNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete from specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Playlist is empty!");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        SongNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position!");
            return;
        }
        temp.next = temp.next.next;
    }

    // Update song details
    public void updateAtPosition(int position, String newTitle, String newArtist, int newDuration) {
        SongNode temp = head;
        for (int i = 1; temp != null && i < position; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        temp.songTitle = newTitle;
        temp.artist = newArtist;
        temp.durationInSeconds = newDuration;
    }

    // Display playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty!");
            return;
        }
        SongNode temp = head;
        int pos = 1;
        while (temp != null) {
            System.out.println(pos + ". " + temp.songTitle + " | " + temp.artist + " | " + temp.durationInSeconds + "s");
            temp = temp.next;
            pos++;
        }
    }
}

public class PROBLEM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int choice;

        do {
            System.out.println("\n🎵 Music Playlist Menu:");
            System.out.println("1. Add song at beginning");
            System.out.println("2. Add song at end");
            System.out.println("3. Add song at specific position");
            System.out.println("4. Delete song from beginning");
            System.out.println("5. Delete song from end");
            System.out.println("6. Delete song from specific position");
            System.out.println("7. Update song details at a position");
            System.out.println("8. Display playlist");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter title: ");
                    sc.nextLine();
                    String title = sc.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter duration (seconds): ");
                    int duration = sc.nextInt();
                    playlist.addAtBeginning(title, artist, duration);
                }
                case 2 -> {
                    System.out.print("Enter title: ");
                    sc.nextLine();
                    String title = sc.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter duration (seconds): ");
                    int duration = sc.nextInt();
                    playlist.addAtEnd(title, artist, duration);
                }
                case 3 -> {
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter duration (seconds): ");
                    int duration = sc.nextInt();
                    playlist.addAtPosition(pos, title, artist, duration);
                }
                case 4 -> playlist.deleteAtBeginning();
                case 5 -> playlist.deleteAtEnd();
                case 6 -> {
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    playlist.deleteAtPosition(pos);
                }
                case 7 -> {
                    System.out.print("Enter position to update: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter new artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter new duration (seconds): ");
                    int duration = sc.nextInt();
                    playlist.updateAtPosition(pos, title, artist, duration);
                }
                case 8 -> playlist.displayPlaylist();
                case 9 -> System.out.println("Exiting... Goodbye 🎶");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}

