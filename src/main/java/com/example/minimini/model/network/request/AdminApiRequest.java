package com.example.minimini.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminApiRequest {
    private Long admId;
    private String admAccount;
    private String admPassword;
    private int admGrade;
}
