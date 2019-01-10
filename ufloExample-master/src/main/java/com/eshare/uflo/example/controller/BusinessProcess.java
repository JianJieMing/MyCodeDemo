package com.eshare.uflo.example.controller;

import com.bstek.uflo.service.ProcessService;
import com.bstek.uflo.service.StartProcessInfo;
import com.bstek.uflo.utils.EnvironmentUtils;
import com.eshare.uflo.example.entity.BusinessEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Classname BusinessProcess 业务流程
 * @Date 2019/1/9 15:52
 * @Created by jianjieming
 */
@RestController
public class BusinessProcess {

    @Autowired
    private ProcessService processService;

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @RequestMapping("/startProcess")
    public Object startProcess(String name, String desc) {
        String id = UUID.randomUUID().toString();
        Session session = sessionFactory.openSession();
        try {
            BusinessEntity business = new BusinessEntity();
            business.setId(id);
            business.setName(name);
            business.setDesc(desc);
            session.save(business);
            StartProcessInfo info = new StartProcessInfo(EnvironmentUtils.getEnvironment().getLoginUser());
            info.setBusinessId(id);
            Map<String, Object> variables = new HashMap<>();
            variables.put("approveUser", "superman");
            info.setVariables(variables);
            processService.startProcessByName("demo", info);
            return null;
        } finally {
            session.close();
        }
    }

}
