package com.tck.controller;

import com.tck.entity.Area;
import com.tck.service.AreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private Map<String, Object> listArea() {
        HashMap<String, Object> map = new HashMap<>();
        List<Area> areaList = areaService.getAreaList();
        map.put("areaList", areaList);
        return map;
    }
}
