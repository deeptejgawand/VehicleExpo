package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.Payment;
import com.example.demo.Repositories.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public String savePayment(Payment payment) {
        if (payment != null) {
            paymentRepository.save(payment);
            return "Payment saved successfully";
        } else {
            return "Failed to save payment. Please provide valid information.";
        }
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment findPaymentById(int paymentId) {
        return paymentRepository.getById(paymentId);
    }
}
