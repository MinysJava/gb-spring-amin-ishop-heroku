package ru.geekbrains.spring.ishop.rest.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring.ishop.entity.User;
import ru.geekbrains.spring.ishop.rest.outentities.OutUser;
import ru.geekbrains.spring.ishop.rest.services.OutEntityService;

@Service
public class UserToOutUserConverter implements Converter<User, OutUser> {

    private OutEntityService outEntityService;

    @Autowired
    public void setOutEntityService(OutEntityService outEntityService) {
        this.outEntityService = outEntityService;
    }

    @Override
    public OutUser convert(@Nullable User user) {
        assert user != null;
        return outEntityService.createOutUser(user);
    }

}
