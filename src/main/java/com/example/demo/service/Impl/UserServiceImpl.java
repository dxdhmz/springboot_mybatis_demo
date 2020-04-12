package com.example.demo.service.Impl;
import com.example.demo.model.tTest;
import com.example.demo.mapper.tTestMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    tTestMapper ttestMapper;

    @Override
    public String setUser(String name, String author) {
        tTest ttest = ttestMapper.SelByName(name);
        if (ttest == null) {
            tTest test = new tTest();
            test.setName(name);
            test.setAuthor(author);
            ttestMapper.insert(test);
            return "success";
        }
        else{
            return "already set for "+ name;
        }
    }

    @Override
    public String getUserById(Long id) {
        tTest ttest = ttestMapper.SelById(id);
        System.out.println(ttest);
        return ttest.getName();
    }

}
