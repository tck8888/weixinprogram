package com.tck.dao;

import com.tck.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by tck on 2018/2/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }

    @Test
    @Ignore
    public void querAreaById() throws Exception {
        Area area = areaDao.querAreaById(1);
        assertEquals("上海", area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() throws Exception {
        Area area = new Area();
        area.setAreaName("武汉");
        area.setPriority(1);
        areaDao.insertArea(area);
    }

    @Test
    @Ignore
    public void updateArea() throws Exception {
        Area area = new Area();
        area.setAreaName("应城");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
    public void deleteArea() throws Exception {
        int effectedNum = areaDao.deleteArea(3);
        assertEquals(1,effectedNum);
    }

}