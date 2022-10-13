package com.example.KayneWestApi.service;

import com.example.KayneWestApi.model.KanyeDto;
import com.example.KayneWestApi.webclient.KanyeClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KanyeService {

    private final KanyeClient kanyeClient;

    public KanyeDto getQuote() {
        return KanyeClient.getQuote;
    }

}



