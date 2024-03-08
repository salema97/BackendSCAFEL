package com.Scafel.ecom.services.auth;

import com.Scafel.ecom.dto.SignupRequest;
import com.Scafel.ecom.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);
}
