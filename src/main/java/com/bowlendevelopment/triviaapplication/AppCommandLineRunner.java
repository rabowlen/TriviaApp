package com.bowlendevelopment.triviaapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppCommandLineRunner.class);

    @Autowired
    Environment environment;

    @Value("${spring.application.name}")
    String appName;

    @Value("${spring.data.mongodb.host}")
    String host;

    @Value("${spring.data.mongodb.port}")
    int port;

    @Override
    public void run(String... args) throws Exception {
        logger.info("\n\n**************************************************" +
                    "\n {} started at {}:{}", appName, host, port +
                    "\n**************************************************");

    }
}
