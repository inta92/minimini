package com.example.minimini.controller.Api;

import com.example.minimini.ifs.CrudInterface;
import com.example.minimini.model.entity.Admin;
import com.example.minimini.model.network.Header;
import com.example.minimini.model.network.request.AdminApiRequest;
import com.example.minimini.model.network.response.AdminApiResponse;
import com.example.minimini.service.AdminApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminApiController extends CrudController<AdminApiRequest, AdminApiResponse, Admin>{

    @Autowired
    private AdminApiLogicService adminApiLogicService;

    @Override
    @PostMapping("")
    public Header<AdminApiResponse> create(@RequestBody Header<AdminApiRequest> request) {
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

