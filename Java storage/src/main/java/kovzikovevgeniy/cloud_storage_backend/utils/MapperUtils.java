package kovzikovevgeniy.cloud_storage_backend.utils;

import kovzikovevgeniy.cloud_storage_backend.entity.UserEntity;
import kovzikovevgeniy.cloud_storage_backend.dto.UserDto;

public interface MapperUtils {

    UserEntity toUserEntity(UserDto userDto);

    UserDto toUserDto(UserEntity userEntity);

}
