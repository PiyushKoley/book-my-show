package com.example.project.bookmyshowbackend.Service.ServiceInterfaces;

import com.example.project.bookmyshowbackend.dto.EntryRequest.UserEntryDto;
import com.example.project.bookmyshowbackend.dto.ResponseDto.UserResponseDto;

public interface UserService {

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);

}
