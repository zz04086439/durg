package com.github.binarywang.demo.wx.mp.service;

import com.github.binarywang.demo.wx.mp.domain.Durg;
import com.github.binarywang.demo.wx.mp.repository.DurgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lzx on 2018/12/22.
 */
@Service
public class DurgService {
    @Autowired
    private DurgRepository durgRepository;

    public String getInfo(String content) {
        Durg durg = durgRepository.getOne(1L);
        return "[" + durg.getName() + "]位于:" + durg.getPlace();
    }
}
