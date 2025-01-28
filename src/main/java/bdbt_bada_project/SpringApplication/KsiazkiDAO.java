package bdbt_bada_project.SpringApplication;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KsiazkiDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public KsiazkiDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Pobieranie wszystkich książek
    public List<Ksiazki> list() {
        String sql = "SELECT * FROM Ksiazki";
        List<Ksiazki> listKsiazki = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Ksiazki.class));
        return listKsiazki;
    }

    // Wstawianie nowej książki
    public void save(Ksiazki ksiazki) {
        String sql = "INSERT INTO Ksiazki (tytul, isbn, id_biblioteki, id_wydawnictwa) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, ksiazki.getTytul(), ksiazki.getIsbn(), ksiazki.getIdBiblioteki(), ksiazki.getIdWydawnictwa());
    }

    // Pobieranie książki po id
    public Ksiazki get(int id) {
        String sql = "SELECT * FROM Ksiazki WHERE Id_ksiazki = ?";
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Ksiazki.class), id);
    }

    // Aktualizacja książki
    public void update(Ksiazki ksiazki) {
        String sql = "UPDATE Ksiazki SET tytul = ?, isbn = ?, id_biblioteki = ?, id_wydawnictwa = ? WHERE Id_ksiazki = ?";
        jdbcTemplate.update(sql, ksiazki.getTytul(), ksiazki.getIsbn(), ksiazki.getIdBiblioteki(), ksiazki.getIdWydawnictwa(), ksiazki.getIdKsiazki());
    }

    // Usuwanie książki
    public void delete(int id) {
        String sql = "DELETE FROM Ksiazki WHERE Id_ksiazki = ?";
        jdbcTemplate.update(sql, id);
    }
}

