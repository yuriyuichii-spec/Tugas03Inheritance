/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Planet {

    // ===== 5 ATRIBUT =====
    String idPlanet;
    String namaPlanet;
    String galaksi;
    double jarakDariMatahari; // dalam satuan AU (Astronomical Unit)
    int jumlahSatelit;

    // ===== CONSTRUCTOR 1: Kosong =====
    public Planet() {
    }

    // ===== CONSTRUCTOR 2: Sebagian Atribut =====
    public Planet(String idPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.namaPlanet = namaPlanet;
    }

    // ===== CONSTRUCTOR 3: Semua Atribut =====
    public Planet(String idPlanet, String namaPlanet, String galaksi,
                  double jarakDariMatahari, int jumlahSatelit) {
        this.idPlanet = idPlanet;
        this.namaPlanet = namaPlanet;
        this.galaksi = galaksi;
        this.jarakDariMatahari = jarakDariMatahari;
        this.jumlahSatelit = jumlahSatelit;
    }

    // ===== METHOD CREATE (void - tanpa nilai balik) =====
    public void create() {
        System.out.println("=== CREATE ===");
        System.out.println("INSERT INTO planet (id_planet, nama_planet, galaksi, jarak_dari_matahari, jumlah_satelit) "
                + "VALUES ('" + idPlanet + "', '" + namaPlanet + "', '"
                + galaksi + "', " + jarakDariMatahari + ", " + jumlahSatelit + ");");
    }

    // ===== METHOD READ (return String - dengan nilai balik) =====
    public String read() {
        return "SELECT * FROM planet WHERE id_planet = '" + idPlanet + "';";
    }

    // ===== METHOD UPDATE (void - tanpa nilai balik) =====
    public void update() {
        System.out.println("=== UPDATE ===");
        System.out.println("UPDATE planet SET nama_planet = '" + namaPlanet
                + "', galaksi = '" + galaksi
                + "', jarak_dari_matahari = " + jarakDariMatahari
                + ", jumlah_satelit = " + jumlahSatelit
                + " WHERE id_planet = '" + idPlanet + "';");
    }

    // ===== METHOD DELETE (return String - dengan nilai balik) =====
    public String delete() {
        return "DELETE FROM planet WHERE id_planet = '" + idPlanet + "';";
    }
}