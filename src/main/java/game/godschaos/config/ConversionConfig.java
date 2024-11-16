package game.godschaos.config;

import game.godschaos.converters.HeroEntityToHeroResponseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class ConversionConfig {
    @Autowired
    ApplicationContext context;

    private Set<Converter> getConverters() {
        Set<Converter> converters = new HashSet<>();

        converters.add(new HeroEntityToHeroResponseConverter());
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
