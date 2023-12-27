package com.example.demo.controllers;

import com.example.demo.entities.Participant;
import com.example.demo.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @PostMapping("/insertParticipant")
    public ResponseEntity<String> insertParticipant(@RequestParam String nom, @RequestParam String mail, @RequestParam String fonction, @RequestParam String type, @RequestParam(required = false) MultipartFile pdf) {
        try {
            byte[] pdfBytes = (pdf != null) ? pdf.getBytes() : null;
            participantService.insertParticipant(nom, mail, fonction, type, pdfBytes);
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
        }
    }
}
