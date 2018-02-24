package com.tck.controller;

import com.tck.entity.Area;
import com.tck.service.AreaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tck on 2018/2/24.
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Resource
    private AreaService areaService;

    @GetMapping(value = "listarea")
    public Map<String, Object> listArea() {
        HashMap<String, Object> map = new HashMap<>();
        List<Area> areaList = areaService.getAreaList();
        map.put("areaList", areaList);
        return map;
    }

    @GetMapping(value = "getAreaById")
    public Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> map = new HashMap<>();
        Area area = areaService.getAreaById(areaId);
        map.put("area", area);
        return map;
    }

    @PostMapping(value = "addArea")
    public Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", areaService.addArea(area));
        return map;
    }

    @PostMapping(value = "modfiyArea")
    public Map<String, Object> modfiyArea(@RequestBody Area area) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", areaService.modifyArea(area));
        return map;
    }

    @GetMapping(value = "removeAreaById")
    public Map<String, Object> removeAreaById(Integer areaId) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", areaService.removeAreaById(areaId));
        return map;
    }
}
