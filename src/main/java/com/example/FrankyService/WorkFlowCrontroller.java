package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/workflow")
@RestController
public class WorkFlowCrontroller {
    WorkFlowService workFlowService;

    WorkFlowCrontroller(WorkFlowService workFlowService) {
        this.workFlowService = workFlowService;
    }

    @GetMapping("/get_work_flows")
    public List list() {
        return workFlowService.obtainList();
    }

    @PostMapping("/post_work_flow")
    public String save(
            @RequestBody WorkFlowDto workFlowDto) {
        WorkFlow workFlow = new WorkFlow(workFlowDto.name(), workFlowDto.desc());
        this.workFlowService.create(
                workFlow);
        return "OK";
    }

    @PutMapping("/update_work_flow")
    public boolean update(
            @RequestBody WorkFlowDto workFlowDto) {
        WorkFlow workFlow = new WorkFlow(workFlowDto.name(), workFlowDto.desc());
        return this.workFlowService.update(
                workFlow);
    }

    @DeleteMapping("/delete/{name}")
    public boolean delete(@PathVariable String name) {
        return this.workFlowService.delete(name);
    }

}
