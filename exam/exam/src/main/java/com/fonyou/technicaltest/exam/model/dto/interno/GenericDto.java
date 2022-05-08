package com.fonyou.technicaltest.exam.model.dto.interno;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder({"data", "messages"})
public class GenericDto<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("messages")
    private List<ErrorMessage> errorMessages;

    public GenericDto(T data) {
        this.data = data;
    }
}