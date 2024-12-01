package game.godschaos.converters;

import game.godschaos.entities.CollectedHero;
import game.godschaos.models.responses.CollectionResponse;
import game.godschaos.services.HeroService;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.converter.Converter;


public class CollectedHeroToCollectionResponseConverter implements Converter<CollectedHero, CollectionResponse> {
    ApplicationContext applicationContext;

    public CollectedHeroToCollectionResponseConverter(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public CollectionResponse convert(CollectedHero source) {
        CollectionResponse response = new CollectionResponse();

        HeroService heroService = applicationContext.getBean(HeroService.class);


        return null;
    }
}
