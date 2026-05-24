/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PlanetKerdil extends Planet {

    // ===== 2 ATRIBUT TAMBAHAN =====
    String statusIAU;        // status resmi dari International Astronomical Union
    String alasanDikerdilkan; // alasan kenapa tidak dianggap planet penuh

    // ===== CONSTRUCTOR =====
    public PlanetKerdil() {
    }

    public PlanetKerdil(String idPlanet, String namaPlanet, String galaksi,
                        double jarakDariMatahari, int jumlahSatelit,
                        String statusIAU, String alasanDikerdilkan) {
        // Panggil constructor parent
        super(idPlanet, namaPlanet, galaksi, jarakDariMatahari, jumlahSatelit);
        this.statusIAU = statusIAU;
        this.alasanDikerdilkan = alasanDikerdilkan;
    }

    // ===== METHOD TAMBAHAN 1 (void - tanpa nilai balik) =====
    public void tampilInfo() {
        System.out.println("=== INFO PLANET KERDIL ===");
        System.out.println("ID        : " + idPlanet);
        System.out.println("Nama      : " + namaPlanet);
        System.out.println("Galaksi   : " + galaksi);
        System.out.println("Jarak     : " + jarakDariMatahari + " AU");
        System.out.println("Satelit   : " + jumlahSatelit);
        System.out.println("Status IAU: " + statusIAU);
        System.out.println("Alasan    : " + alasanDikerdilkan);
    }

    // ===== METHOD TAMBAHAN 2 (return String - dengan nilai balik) =====
    public String cekStatus() {
        if (statusIAU.equalsIgnoreCase("Resmi")) {
            return namaPlanet + " adalah Planet Kerdil yang RESMI diakui IAU.";
        } else {
            return namaPlanet + " BELUM resmi diakui sebagai Planet Kerdil oleh IAU.";
        }
    }
}