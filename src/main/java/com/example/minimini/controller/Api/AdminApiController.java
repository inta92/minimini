package com.example.minimini.controller.Api;

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
        return adminApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<AdminApiResponse> read(@PathVariable Long id) {
        return adminApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<AdminApiResponse> update(@RequestBody Header<AdminApiRequest> request) {
        return adminApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return adminApiLogicService.delete(id);
    }
}

