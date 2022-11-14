package com.example.minimini.service;

import com.example.minimini.component.LoginUserAuditorAware;
import com.example.minimini.config.JpaConfig;
import com.example.minimini.controller.Api.CrudController;
import com.example.minimini.model.entity.Admin;
import com.example.minimini.model.network.Header;
import com.example.minimini.model.network.request.AdminApiRequest;
import com.example.minimini.model.network.response.AdminApiResponse;
import com.example.minimini.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

@Import({JpaConfig.class, LoginUserAuditorAware.class})
public class AdminApiLogicService extends CrudController<AdminApiRequest,AdminApiResponse,Admin> {

    @Autowired
    private AdminRepository adminRepository;
    public Header<AdminApiResponse> response(Admin admin) {
        AdminApiResponse adminApiResponse = AdminApiResponse.builder()
                .admId(admin.getAdmId())
                .admAccount(admin.getAccount())
                .admPassword(admin.getPassword())
                .admGrade(admin.getAdmGrade())
                .build();
        return Header.OK(adminApiResponse);
    }

    @Override
    public Header<AdminApiResponse> create(Header<AdminApiRequest> request) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> read(Long id) {
        Optional<Admin> admin = adminRepository.findById(id);
        return admin.map(newAdmin -> response(newAdmin)).orElseGet(()->Header.ERROR("데이터 없음!"));
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
