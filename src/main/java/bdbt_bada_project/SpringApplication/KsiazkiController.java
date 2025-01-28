package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class KsiazkiController {

    @Autowired
    private KsiazkiDAO ksiazkiDAO;

    @GetMapping("/ksiazki")
    public String wyswietlKsiazki(Model model) {
        List<Ksiazki> listKsiazki = ksiazkiDAO.list();
        model.addAttribute("listKsiazki", listKsiazki);
        return "ksiazki_user";
    }

    @PostMapping("/ksiazki/zapisz")
    public String zapiszKsiazke(@ModelAttribute Ksiazki ksiazki) {
        ksiazkiDAO.save(ksiazki);
        return "redirect:/ksiazki";
    }

    @GetMapping("/ksiazki/edytuj/{id}")
    public String edytujKsiazke(@PathVariable int id, Model model) {
        Ksiazki ksiazka = ksiazkiDAO.get(id);
        model.addAttribute("ksiazka", ksiazka);
        return "edytuj_ksiazke";
    }

    @PostMapping("/ksiazki/aktualizuj")
    public String aktualizujKsiazke(@ModelAttribute Ksiazki ksiazki) {
        ksiazkiDAO.update(ksiazki);
        return "redirect:/ksiazki";
    }

    @GetMapping("/ksiazki/usun/{id}")
    public String usunKsiazke(@PathVariable int id) {
        ksiazkiDAO.delete(id);
        return "redirect:/ksiazki";
    }
}
