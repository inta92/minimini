package com.example.minimini.controller.Api;

import com.example.minimini.model.entity.User;
import com.example.minimini.model.network.request.UserApiRequest;
import com.example.minimini.model.network.response.UserApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {

}
