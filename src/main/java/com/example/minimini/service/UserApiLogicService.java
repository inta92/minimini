package com.example.minimini.service;

import com.example.minimini.component.LoginUserAuditorAware;
import com.example.minimini.config.JpaConfig;
import com.example.minimini.model.entity.User;
import com.example.minimini.model.network.Header;
import com.example.minimini.model.network.request.UserApiRequest;
import com.example.minimini.model.network.response.UserApiResponse;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Import({JpaConfig.class, LoginUserAuditorAware.class})
public class UserApiLogicService extends BaseService<UserApiRequest, UserApiResponse, User> {

    private Header<UserApiResponse> response(User user){
        UserApiResponse userApiResponse = UserApiResponse.builder()
                .userId(user.getUserId())
                .account(user.getAccount())
                .password(user.getPassword())
                .name(user.getName())
                .phoneNumber(user.getPhoneNumber())
                .address(user.getAddress())
                .gender(user.getGender())
                .age(user.getAge())
                //.registeredDate(user.getRegisteredDate())
                .build();

        return Header.OK(userApiResponse);
    }

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();

        User user =User.builder()
                .account(userApiRequest.getAccount())
                .password(userApiRequest.getPassword())
                .name(userApiRequest.getName())
                .phoneNumber(userApiRequest.getPhoneNumber())
                .address(userApiRequest.getAddress())
                .gender(userApiRequest.getGender())
                .age(userApiRequest.getAge())
                .build();

        User newUser = baseRepository.save(user);
        return response(newUser);
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        Optional<User> user = baseRepository.findById(id);
        return user.map(newUser -> response(newUser))
                .orElseGet(()->Header.ERROR("데이터 없음"));
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();

        Optional<User> user = baseRepository.findById(userApiRequest.getUserId());

        return user.map(newUser -> {
                    newUser.setAccount(userApiRequest.getAccount())
                            .setPassword(userApiRequest.getPassword())
                            .setName(userApiRequest.getName())
                            .setPhoneNumber(userApiRequest.getPhoneNumber())
                            .setAddress(userApiRequest.getAddress())
                            .setGender(userApiRequest.getGender())
                            .setAge(userApiRequest.getAge());
                    return newUser;
                }).map(newUser -> baseRepository.save(newUser))
                .map(newUser -> response(newUser))
                .orElseGet(()-> Header.ERROR("데이터 없음"));
    }


    @Override
    public Header delete(Long id) {
        Optional<User> user = baseRepository.findById(id);
        //select * from user where id = 1;

        return user.map(newUser -> {
                    baseRepository.delete(newUser);
                    return Header.OK();
                })
                .orElseGet(()->Header.ERROR("찾는데이터가 없어.."));
    }
}
