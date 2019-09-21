package com.draven.imooc16538.dao;

import com.draven.imooc16538.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int deleteArea(int areaId);

    int updateArea(Area area);
}
