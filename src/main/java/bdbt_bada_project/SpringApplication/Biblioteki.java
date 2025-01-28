package bdbt_bada_project.SpringApplication;

public class Biblioteki {


    public Biblioteki(int nr_biblioteki, int nr_adresu, String email, String nr_telefonu, String data_zalozenia, String nazwa) {
        Nr_biblioteki = nr_biblioteki;
        Nr_adresu = nr_adresu;
        Email = email;
        Nr_telefonu = nr_telefonu;
        Data_zalozenia = data_zalozenia;
        Nazwa = nazwa;
    }

    public Biblioteki() {
    }

    private int Nr_biblioteki;
    private String Nazwa;
    private String Data_zalozenia;
    private String Nr_telefonu;
    private String Email;
    private int Nr_adresu;

    public int getNr_biblioteki() {
        return Nr_biblioteki;
    }

    public void setNr_biblioteki(int nr_biblioteki) {
        Nr_biblioteki = nr_biblioteki;
    }

    public int getNr_adresu() {
        return Nr_adresu;
    }

    public void setNr_adresu(int nr_adresu) {
        Nr_adresu = nr_adresu;
    }

    public String getNr_telefonu() {
        return Nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        Nr_telefonu = nr_telefonu;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getData_zalozenia() {
        return Data_zalozenia;
    }

    public void setData_zalozenia(String data_zalozenia) {
        Data_zalozenia = data_zalozenia;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "TPM{" +
                "Nr_przedsiebiorstwa=" + Nr_biblioteki +
                ", Nazwa='" + Nazwa + '\'' +
                ", Data_zalozenia='" + Data_zalozenia + '\'' +
                ", Nr_telefonu='" + Nr_telefonu + '\'' +
                ", Email='" + Email + '\'' +
                ", Nr_adresu=" + Nr_adresu +
                '}';
    }
}