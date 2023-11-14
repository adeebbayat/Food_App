package com.adeebbayat.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adeebbayat.server.models.Payment;
import com.adeebbayat.server.repositories.PaymentRepository;



@Service
public class PaymentService {
    
    private final PaymentRepository paymentRepository;

    // ?
    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    // Create Payment
    public Payment addPayment(Payment payment){
        return paymentRepository.save(payment);
    }

    // Find All
    public List<Payment> allPayments(){
        return paymentRepository.findAll();
    }

    // Find One Payment
    public Payment findPayment(Long id){
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if(optionalPayment.isPresent()){
            return optionalPayment.get();
        }
        return null;
    }

    // Update Payment
    public Payment updatePayment(Payment payment){
        return paymentRepository.save(payment);
    }

    // Delete Payment
    public void deletePayment(Long id){
        paymentRepository.deleteById(id);
    }


}

