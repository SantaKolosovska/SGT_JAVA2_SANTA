package lv.santak.testproject;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override   // you can skip this if you want to keep the original configuration
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/calculate")
                .hasRole("manager")
                .antMatchers("test")
                .authenticated()
                .anyRequest()
                .permitAll()
                    .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login.html?error=true")
                    .and()
                .logout()
                .permitAll()



        ;

    }

}
