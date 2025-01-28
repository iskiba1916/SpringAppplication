package bdbt_bada_project.SpringApplication;

public class Ksiazki {
    private int idKsiazki;
    private String tytul;
    private String isbn;
    private int idBiblioteki;
    private int idWydawnictwa;

    // Gettery i Settery
    public int getIdKsiazki() {
        return idKsiazki;
    }

    public void setIdKsiazki(int idKsiazki) {
        this.idKsiazki = idKsiazki;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getIdBiblioteki() {
        return idBiblioteki;
    }

    public void setIdBiblioteki(int idBiblioteki) {
        this.idBiblioteki = idBiblioteki;
    }

    public int getIdWydawnictwa() {
        return idWydawnictwa;
    }

    public void setIdWydawnictwa(int idWydawnictwa) {
        this.idWydawnictwa = idWydawnictwa;
    }

    @Override
    public String toString() {
        return "Ksiazki{" +
                "idKsiazki=" + idKsiazki +
                ", tytul='" + tytul + '\'' +
                ", isbn='" + isbn + '\'' +
                ", idBiblioteki'" +idBiblioteki +'\'' +
                ", idWydawnictwa'" +idWydawnictwa +'\'' +
                '}';
}}



