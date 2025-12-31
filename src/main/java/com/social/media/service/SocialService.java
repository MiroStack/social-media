package com.social.media.service;

import com.social.media.models.SocialUser;

import java.util.List;

public interface SocialService {
    List<SocialUser> getAllUsers();

    SocialUser saveUser(SocialUser socialUser);

    SocialUser deleteUser(Long id);
}
