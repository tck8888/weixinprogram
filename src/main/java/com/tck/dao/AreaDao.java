package com.tck.dao;

import com.tck.entity.Area;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by tck on 2018/2/17.
 */
@Mapper
public interface AreaDao {

    List<Area> queryArea();

    Area querAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int area);
}
