package com.example.FrankyService;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkFlowServiceTest {

    @Test
    void obtainList() {
        WorkFlowService workFlowService = new WorkFlowService();
        List<WorkFlow> workFlows = workFlowService.obtainList();
        assertNotNull(workFlows);
    }

    @Test
    void create() {
        WorkFlowService workFlowService = new WorkFlowService();
        List<WorkFlow> workFlows = workFlowService.obtainList();
        workFlowService.create(new WorkFlow("nose","..."));
        assertEquals(workFlows.size(), 1);

    }

    @Test
    void delete() {
        WorkFlowService workFlowService = new WorkFlowService();
        workFlowService.create(new WorkFlow("nose","..."));
        boolean resp=workFlowService.delete("nose");
        assertEquals(true, resp );
    }
}