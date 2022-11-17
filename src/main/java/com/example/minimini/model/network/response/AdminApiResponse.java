package com.example.minimini.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)

public class AdminApiResponse {

    private Long admId;
    private String account;
    private String password;
    private int admGrade;
}
