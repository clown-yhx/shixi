package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysGuest;

import java.util.List;

/**
 * 访客信息表Service接口
 * 
 * @author ruoyi
 * @date 2022-07-13
 */
public interface ISysGuestService 
{
    /**
     * 查询访客信息表
     * 
     * @param guestId 访客信息表主键
     * @return 访客信息表
     */
    public SysGuest selectSysGuestByGuestId(Long guestId);

    /**
     * 查询访客信息表列表
     * 
     * @param sysGuest 访客信息表
     * @return 访客信息表集合
     */
    public List<SysGuest> selectSysGuestList(SysGuest sysGuest);

    /**
     * 新增访客信息表
     * 
     * @param sysGuest 访客信息表
     * @return 结果
     */
    public int insertSysGuest(SysGuest sysGuest);

    /**
     * 修改访客信息表
     * 
     * @param sysGuest 访客信息表
     * @return 结果
     */
    public int updateSysGuest(SysGuest sysGuest);

    /**
     * 批量删除访客信息表
     * 
     * @param guestIds 需要删除的访客信息表主键集合
     * @return 结果
     */
    public int deleteSysGuestByGuestIds(Long[] guestIds);

    /**
     * 删除访客信息表信息
     * 
     * @param guestId 访客信息表主键
     * @return 结果
     */
    public int deleteSysGuestByGuestId(Long guestId);
}
