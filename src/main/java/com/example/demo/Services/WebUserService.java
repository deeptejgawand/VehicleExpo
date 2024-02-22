package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.WebUser;
import com.example.demo.Repositories.WebUserRepository;

@Service
public class WebUserService {
    @Autowired
    private WebUserRepository webUserRepository;

    public List<WebUser> getAllWebUsers() {
        return webUserRepository.findAll();
    }

    public WebUser getWebUserById(int id) {
        return webUserRepository.findById(id).orElse(null);
    }

    public WebUser saveWebUser(WebUser webUser) {
        return webUserRepository.save(webUser);
    }

    public void deleteWebUser(int id) {
        webUserRepository.deleteById(id);
    }
}
