package com.jps.example.usergreetingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class EurekaService {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public EurekaService(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

}
