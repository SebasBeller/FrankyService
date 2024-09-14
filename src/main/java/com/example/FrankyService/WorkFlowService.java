package com.example.FrankyService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class WorkFlowService {
    List<WorkFlow> lista= new ArrayList<>(); // no debe haber una dependencia deberia haber un repositorio y devolver, no deberia estar en el service

    public List obtainList(){
        return this.lista;
    }
    public void create(WorkFlow workFlow){
        this.lista.add(workFlow);
    }
    public boolean delete(String workFlowName){
        return this.lista.removeIf(it ->
                it.getName().equals(workFlowName)
        );
    }
    WorkFlow find_workFlow_by_name(String workFlowName){
        return this.lista.stream()
                .filter(workFlow -> workFlow.getName().equals(workFlowName))
                .findAny()
                .orElse(null);
    }


    public boolean update(WorkFlow workFlowToUpdate){
        WorkFlow workFlow = this.find_workFlow_by_name(workFlowToUpdate.getName());
        workFlow.setName(workFlowToUpdate.getName());
        workFlow.setDescription(workFlowToUpdate.getDescription());
        return workFlow.getName().equals(workFlowToUpdate.getName());
    }
}
