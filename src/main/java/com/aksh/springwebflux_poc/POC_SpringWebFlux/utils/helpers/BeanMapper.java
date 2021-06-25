package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.helpers;

import java.util.List;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class BeanMapper {
    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    private static final MapperFacade mapper = mapperFactory.getMapperFacade();

    public static <S, C> C map(S source, Class<C> clazz) {
        return source == null ? null : mapper.map(source, clazz);
    }

    public static <S, C> List<C> mapAsList(Iterable<S> source, Class<C> clazz) {
        return source == null ? null : mapper.mapAsList(source, clazz);
    }
}
