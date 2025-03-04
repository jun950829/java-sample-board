package com.example.simple_board.post.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostRequest {

    private Long boardId = 1L;

    @NotBlank
    private String userName;

    @NotBlank
    @Size(max = 4, min = 4)
    private String password;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String title;


    @NotBlank
    private String content;
}
