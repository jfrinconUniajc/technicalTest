package com.fonyou.technicaltest.exam.model.dto.interno;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@JsonPropertyOrder({"code", "message", "parameters", "type"})
public class ErrorMessage {
    private String code;
    private String message;
    private String type;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ParameterError> parameters;
}
