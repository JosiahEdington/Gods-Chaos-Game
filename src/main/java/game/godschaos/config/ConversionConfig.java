package game.godschaos.config;

import game.godschaos.converters.AbilityToAbilityResponseConverter;
import game.godschaos.converters.HeroToHeroResponseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.context.support.ConversionServiceFactoryBean;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class ConversionConfig {
    @Autowired
    ApplicationContext context;

    private Set<Converter> getConverters() {
        Set<Converter> converters = new HashSet<>();

        converters.add(new HeroToHeroResponseConverter(context));
        converters.add(new AbilityToAbilityResponseConverter());
        return converters;
    }

    @Bean
    public ConversionService conversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(getConverters());
        bean.afterPropertiesSet();

        return bean.getObject();
    }
}
