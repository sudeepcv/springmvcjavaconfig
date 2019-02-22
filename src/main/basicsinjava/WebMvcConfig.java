package basicsinjava;

/**
 * Created by lenovo on 22-Feb-19.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("basicsinjava")
public class WebMvcConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();



        // set location of views.
        vr.setPrefix("/");

        // set the extension of views.
        vr.setSuffix(".jsp");

        return vr;
    }


}
