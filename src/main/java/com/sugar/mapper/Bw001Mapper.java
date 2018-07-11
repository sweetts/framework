package com.sugar.mapper;

import com.sugar.beans.BW003Bean;

import java.util.List;

/**
 * Created by TangSu on 2017/5/23.
 */
public interface Bw001Mapper {
    public BW003Bean selectBwById(String BWID001) throws Exception;

    public void updateBw001(BW003Bean bean) throws Exception;

    public void deleteBw001(BW003Bean bean) throws Exception;

    public void insertBw001(BW003Bean bean) throws Exception;

    public List<BW003Bean> selectAll(BW003Bean bean) throws Exception;
}
