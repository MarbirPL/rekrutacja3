package com.example.KayneWestApi.webclient;

import com.example.KayneWestApi.model.KanyeDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class KanyeClient {

    private static final String KANYE_REST_URL = "https://api.kanye.rest";
    private RestTemplate restTemplate = new RestTemplate();


    public String getQuote() {
        return callGetMethod(KANYE_REST_URL,
                String.class);
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(KANYE_REST_URL + url,
                responseType, objects);
    }


    public KanyeDto getQuote() {
        KanyeDto kanyeDto = callGetMethod("/",
                KanyeDto.class);
        return KanyeDto.builder()
                .quote(KanyeDto.getMain().getQuote())
                .build();
    }

}






