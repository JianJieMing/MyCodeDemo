package com.eshare.uflo.example;

import com.bstek.uflo.env.Context;
import com.bstek.uflo.model.ProcessInstance;
import com.bstek.uflo.process.handler.AssignmentHandler;
import com.bstek.uflo.process.node.TaskNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Classname TestAssignmentHandler
 * @Date 2019/1/9 11:21
 * @Created by jianjieming
 */
@Component("testAssignmentHandler")
public class TestAssignmentHandler implements AssignmentHandler {
    @Override
    public Collection<String> handle(TaskNode taskNode, ProcessInstance processInstance, Context context) {
        Collection<String> list = new ArrayList<>();
        list.add("manager");
        return list;
    }
}
