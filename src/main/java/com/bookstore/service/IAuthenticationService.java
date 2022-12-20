package com.bookstore.service;

import com.bookstore.model.User;

public interface IAuthenticationService {

    User signInAndReturnJWTUser(User signInRequest);
}
