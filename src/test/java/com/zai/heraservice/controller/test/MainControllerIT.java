package com.zai.heraservice.controller.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainControllerIT {

    @LocalServerPort
    private int port;

    private URL baseUrl;

    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    public void setUrl() {
        try {
            this.baseUrl = new URL("http://localhost:" + port + "/hello/test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getResp() {
        ResponseEntity<String> resp = template.getForEntity(baseUrl.toString(), String.class);
        try {
            assertThat(resp.getBody()).isEqualTo("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
