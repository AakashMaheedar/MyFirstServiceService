package com.freshworks.com.repository;

import com.freshworks.com.domain.MyFirstService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class MyFirstServiceRepository {

    private static final String template = "Hello, %s!";

}
