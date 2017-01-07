package ua.alexandroid1.alex.config;

/**
 * Created by Oleksandr on 07.01.2017.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

// Говорим, что это конфигурация
@Configuration
// Включаем MVC
@EnableWebMvc
// Указываем где искать контроллеры и остальные компоненты
@ComponentScan("ua.alexandroid1.alex")
public class WebAppConfig {

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        // указываем где будут лежать наши веб-страницы
        resolver.setPrefix("/pages/");
        // формат View который мы будем использовать
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

}