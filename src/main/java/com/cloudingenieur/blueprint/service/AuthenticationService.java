package com.cloudingenieur.blueprint.service;

import com.cloudingenieur.blueprint.payload.response.AuthenticationResponse;
import com.cloudingenieur.blueprint.payload.request.AuthenticationRequest;
import com.cloudingenieur.blueprint.payload.request.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
