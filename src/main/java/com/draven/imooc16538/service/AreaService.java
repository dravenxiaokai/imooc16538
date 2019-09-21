package com.draven.imooc16538.service;

import com.draven.imooc16538.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryAreaList();

    Area queryAreaById(int areaId);

    boolean addArea(Area area);

    boolean deleteArea(int areaId);

    boolean modifyArea(Area area);
}
