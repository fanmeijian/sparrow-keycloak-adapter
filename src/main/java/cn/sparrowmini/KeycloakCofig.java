package cn.sparrowmini;

import org.keycloak.OAuth2Constants;
import org.keycloak.adapters.springboot.KeycloakSpringBootProperties;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakCofig {
    @Bean
    Keycloak keycloak(KeycloakSpringBootProperties props) {
        return KeycloakBuilder.builder() //
                .serverUrl(props.getAuthServerUrl()) //
                .realm(props.getRealm()) //
                .grantType(OAuth2Constants.CLIENT_CREDENTIALS) //
                .clientId(props.getResource()) //
                .clientSecret((String) props.getCredentials().get("secret")) //
                .build();
    }
}
