package ru.geekbrains.spring.ishop.rest.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring.ishop.entity.Delivery;
import ru.geekbrains.spring.ishop.rest.outentities.OutDelivery;
import ru.geekbrains.spring.ishop.rest.services.OutEntityService;

@Service
public class DeliveryToOutDeliveryConverter implements Converter<Delivery, OutDelivery> {

    private OutEntityService outEntityService;

    @Autowired
    public void setOutEntityService(OutEntityService outEntityService) {
        this.outEntityService = outEntityService;
    }

    @Override
    public OutDelivery convert(@Nullable Delivery delivery) {
        assert delivery != null;
        return outEntityService.createOutDelivery(delivery);
    }

}
