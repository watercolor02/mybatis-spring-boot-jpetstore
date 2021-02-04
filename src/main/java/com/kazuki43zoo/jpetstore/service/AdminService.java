package com.kazuki43zoo.jpetstore.service;

import com.kazuki43zoo.jpetstore.domain.Account;
import com.kazuki43zoo.jpetstore.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminService {

    private final AdminMapper adminMapper;

    public int getAccountCount() {
        return adminMapper.getAccountCount();
    }

    public List<Account> getAccountList() {
        return adminMapper.getAccountList();
    }
}
