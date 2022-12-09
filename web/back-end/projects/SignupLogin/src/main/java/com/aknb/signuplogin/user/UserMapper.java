package com.aknb.signuplogin.user;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto entityToDto(User user);

    User dtoToEntity(UserDto source);
}
