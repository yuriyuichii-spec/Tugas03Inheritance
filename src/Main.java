/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("        TUGAS 03 - INHERITANCE          ");
        System.out.println("========================================");

        // ===== OBJECT 1: Constructor Kosong =====
        System.out.println("\n--- Object 1: Constructor Kosong ---");
        Planet planet1 = new Planet();
        planet1.idPlanet = "P001";
        planet1.namaPlanet = "Mars";
        planet1.galaksi = "Bima Sakti";
        planet1.jarakDariMatahari = 1.52;
        planet1.jumlahSatelit = 2;

        planet1.create();
        System.out.println(planet1.read());
        planet1.update();
        System.out.println(planet1.delete());

        // ===== OBJECT 2: Constructor Sebagian =====
        System.out.println("\n--- Object 2: Constructor Sebagian ---");
        Planet planet2 = new Planet("P002", "Jupiter");
        planet2.galaksi = "Bima Sakti";
        planet2.jarakDariMatahari = 5.20;
        planet2.jumlahSatelit = 95;

        planet2.create();
        System.out.println(planet2.read());
        planet2.update();
        System.out.println(planet2.delete());

        // ===== OBJECT 3: Constructor Semua Atribut =====
        System.out.println("\n--- Object 3: Constructor Semua Atribut ---");
        Planet planet3 = new Planet("P003", "Saturnus", "Bima Sakti", 9.58, 146);

        planet3.create();
        System.out.println(planet3.read());
        planet3.update();
        System.out.println(planet3.delete());
    
    
        System.out.println("\n========================================");
        System.out.println("          CHILD CLASS - PlanetKerdil    ");
        System.out.println("========================================");

        PlanetKerdil pk1 = new PlanetKerdil(
                "PK001", "Pluto", "Bima Sakti",
                39.48, 5, "Resmi", "Tidak bisa membersihkan orbitnya"
        );

        // Method warisan dari Planet
        System.out.println("\n-- Method Warisan dari Parent --");
        pk1.create();
        System.out.println(pk1.read());
        pk1.update();
        System.out.println(pk1.delete());

        // Method baru milik PlanetKerdil
        System.out.println("\n-- Method Baru PlanetKerdil --");
        pk1.tampilInfo();
        System.out.println(pk1.cekStatus());
    }
}

