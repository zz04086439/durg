package com.github.binarywang.demo.wx.mp.repository;

import com.github.binarywang.demo.wx.mp.domain.Durg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lzx on 2018/12/22.
 */
@SuppressWarnings("unused")
@Repository
public interface DurgRepository extends JpaRepository<Durg, Long> {
}
