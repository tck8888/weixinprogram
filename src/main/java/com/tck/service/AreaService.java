package com.tck.service;

import com.tck.entity.Area;

import java.util.List;

/**
 * Created by tck on 2018/2/20.
 */
public interface AreaService {
    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int area);
}
