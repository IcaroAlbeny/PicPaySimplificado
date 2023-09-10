package com.picpaysimplificado.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpaysimplificado.doman.user.User;
import com.picpaysimplificado.doman.user.UserType;
import com.picpaysimplificado.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception{
        if(sender.getUserType() != UserType.MERCHANT){
            throw new Exception("Usuário do tipo logista não está autorizado a realizar a transação");
        }
    }
}
