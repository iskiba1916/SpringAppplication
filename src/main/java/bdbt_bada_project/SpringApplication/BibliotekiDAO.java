package bdbt_bada_project.SpringApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BibliotekiDAO {
    /* Import org.springframework.jd....Template */
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public BibliotekiDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List */
    public List<Biblioteki> list(){
        String sql = "SELECT * FROM Biblioteki";
        List<Biblioteki> listBiblioteki = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Biblioteki.class));
        return listBiblioteki;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Biblioteki biblioteki) {
    }
    /* Read – odczytywanie danych z bazy */
    public Biblioteki get(int id) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Biblioteki biblioteki) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id) {
    }

}
