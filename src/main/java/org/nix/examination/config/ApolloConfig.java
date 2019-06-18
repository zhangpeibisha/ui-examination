package org.nix.examination.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.nix.examination.config.yaml.TripartiteServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Bean
    public TripartiteServiceConfig tripartiteServiceConfig(){
        return new TripartiteServiceConfig();
    }

}
