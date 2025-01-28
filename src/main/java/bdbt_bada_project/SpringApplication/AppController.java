package bdbt_bada_project.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Configuration
public class AppController implements WebMvcConfigurer{
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/ksiazki").setViewName("ksiazki");
        registry.addViewController("/biblioteka").setViewName("biblioteka");



        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/index_admin").setViewName("admin/index_admin");
        registry.addViewController("/ksiazki_admin").setViewName("admin/ksiazki_admin");
        registry.addViewController("/biblioteka_admin").setViewName("admin/biblioteka_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");
        registry.addViewController("biblioteka_user").setViewName("user/biblioteka_user");
        registry.addViewController("/index_user").setViewName("user/index_user");
        registry.addViewController("/ksiazki_user").setViewName("user/ksiazki_user");
    }
    @Controller
    public class DashboardController{

        @Autowired
        private KsiazkiDAO dao;


        @RequestMapping("/ksiazki")
        public String showKsiazki(Model model) {

            List<Ksiazki> listKsiazki = dao.list();
            model.addAttribute("listKsiazki", listKsiazki);
            return "ksiazki";
        }



        @RequestMapping("/main")
        public String defaultAfterLogin(HttpServletRequest request) {
            if(request.isUserInRole("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if(request.isUserInRole("USER")) {
                return "redirect:/main_user";
            }
            else{
                    return "redirect:/index";
            }
        }
    }
    @RequestMapping(value={"/main_admin"})
    public String showAdminPage(Model model) {
        return "admin/main_admin";
    }
    @RequestMapping(value={"/main_user"})
    public String showUserPage(Model model) {
        return "user/main_user";
    }

}
