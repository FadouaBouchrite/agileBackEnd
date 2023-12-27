package com.example.demo.services;

import com.example.demo.entities.Participant;
import com.example.demo.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ParticipantService {

    @Autowired
    ParticipantRepository participantRepository;
    public void insertParticipant(String nom,String mail,String function,String type,byte[] pdf){

        Participant participant=new Participant(nom,mail,function,type,pdf);

        participantRepository.save(participant);



    }
}
