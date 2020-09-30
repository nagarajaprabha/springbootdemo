package com.np.npapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by HKOMMARE on 8/9/17.
 */
@Configuration
//@EnableJpaRepositories("com.np")
//@EnableJpaAuditing
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    //    @NotNull
    @Value("${tbe.services.apiBasePath}")
    private String apiBasePath;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.exposeIdsFor(Course.class);
//        config.exposeIdsFor(CourseRegistration.class);
//        config.exposeIdsFor(Lookup.class);
        super.configureRepositoryRestConfiguration(config);
    }

}
