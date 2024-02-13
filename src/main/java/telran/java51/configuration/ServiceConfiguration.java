package telran.java51.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.config.Configuration.*;

import static org.modelmapper.convention.MatchingStrategies.STRICT;

@Configuration
public class ServiceConfiguration {
    @Bean
    public ModelMapper getModelMapper () {
        ModelMapper modelMapper =  new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldAccessLevel(AccessLevel.PRIVATE)
                .setFieldMatchingEnabled(true)
                .setMatchingStrategy(STRICT);
        return modelMapper;
    }
}
