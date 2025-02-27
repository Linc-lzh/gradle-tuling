package com.tuling.order.clients;
import com.tuling.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id);
}
