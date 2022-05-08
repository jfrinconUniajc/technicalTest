package com.fonyou.technicaltest.exam.controller;
import com.fonyou.technicaltest.exam.model.dto.TestDto;
import com.fonyou.technicaltest.exam.model.dto.interno.GenericDto;
import com.fonyou.technicaltest.exam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Test controller.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<GenericDto> createStudent(@RequestBody TestDto test) {
        GenericDto<TestDto> response = new GenericDto<>(testService.createTest(test));
        return ResponseEntity.ok(response);
    }
}
