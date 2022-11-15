package com.example.minimini.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)

public class AdminApiRequest {
    private Long admId;
    private String account;
    private String password;
    private int admGrade;
}
