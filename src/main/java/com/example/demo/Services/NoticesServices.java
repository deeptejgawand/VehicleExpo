package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.Notices;
import com.example.demo.Repositories.NoticesRepository;

@Service
public class NoticesServices {
    @Autowired
    private NoticesRepository noticesRepository;

    public String saveNotice(Notices notice) {
        if (notice != null) {
            noticesRepository.save(notice);
            return "Notice saved successfully";
        } else {
            return "Failed to save notice. Please provide valid information.";
        }
    }

    public List<Notices> getAllNotices() {
        return noticesRepository.findAll();
    }

    public Notices findNoticeById(int noticeId) {
        return noticesRepository.getById(noticeId);
    }
}
