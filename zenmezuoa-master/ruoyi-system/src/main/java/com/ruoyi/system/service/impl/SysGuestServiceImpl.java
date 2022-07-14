package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysGuest;
import com.ruoyi.system.mapper.SysGuestMapper;
import com.ruoyi.system.service.ISysGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 访客信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-13
 */
@Service
public class SysGuestServiceImpl implements ISysGuestService
{
    @Autowired
    private SysGuestMapper sysGuestMapper;

    /**
     * 查询访客信息表
     * 
     * @param guestId 访客信息表主键
     * @return 访客信息表
     */
    @Override
    public SysGuest selectSysGuestByGuestId(Long guestId)
    {
        return sysGuestMapper.selectSysGuestByGuestId(guestId);
    }

    /**
     * 查询访客信息表列表
     * 
     * @param sysGuest 访客信息表
     * @return 访客信息表
     */
    @Override
    public List<SysGuest> selectSysGuestList(SysGuest sysGuest)
    {
        return sysGuestMapper.selectSysGuestList(sysGuest);
    }

    /**
     * 新增访客信息表
     * 
     * @param sysGuest 访客信息表
     * @return 结果
     */
    @Override
    public int insertSysGuest(SysGuest sysGuest)
    {
        return sysGuestMapper.insertSysGuest(sysGuest);
    }

    /**
     * 修改访客信息表
     * 
     * @param sysGuest 访客信息表
     * @return 结果
     */
    @Override
    public int updateSysGuest(SysGuest sysGuest)
    {
        return sysGuestMapper.updateSysGuest(sysGuest);
    }

    /**
     * 批量删除访客信息表
     * 
     * @param guestIds 需要删除的访客信息表主键
     * @return 结果
     */
    @Override
    public int deleteSysGuestByGuestIds(Long[] guestIds)
    {
        return sysGuestMapper.deleteSysGuestByGuestIds(guestIds);
    }

    /**
     * 删除访客信息表信息
     * 
     * @param guestId 访客信息表主键
     * @return 结果
     */
    @Override
    public int deleteSysGuestByGuestId(Long guestId)
    {
        return sysGuestMapper.deleteSysGuestByGuestId(guestId);
    }
}
