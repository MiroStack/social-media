package com.social.media.serviceImp;

import com.social.media.models.SocialUser;
import com.social.media.repository.SocialUserRepository;
import com.social.media.service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialServiceImp implements SocialService {

    @Autowired
    SocialUserRepository socialUserRepository;
    @Override
    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    @Override
    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }
}
