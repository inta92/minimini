package com.example.minimini.service;

import com.example.minimini.component.LoginUserAuditorAware;
import com.example.minimini.config.JpaConfig;
import com.example.minimini.model.entity.Admin;
import com.example.minimini.model.network.Header;
import com.example.minimini.model.network.request.AdminApiRequest;
import com.example.minimini.model.network.response.AdminApiResponse;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import({JpaConfig.class, LoginUserAuditorAware.class})
public class AdminApiLogicService extends BaseService<AdminApiRequest,AdminApiResponse,Admin> {

    @Override
    public Header<AdminApiResponse> create(Header<AdminApiRequest> request) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> update(Header<AdminApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
