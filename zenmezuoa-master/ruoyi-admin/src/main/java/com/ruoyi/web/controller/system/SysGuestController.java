package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysGuest;
import com.ruoyi.system.service.ISysGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 访客信息表Controller
 * 
 * @author ruoyi
 * @date 2022-07-13
 */
@RestController
@RequestMapping("/guest/guest")
public class SysGuestController extends BaseController
{
    @Autowired
    private ISysGuestService sysGuestService;

    /**
     * 查询访客信息表列表
     */
    @PreAuthorize("@ss.hasPermi('guest:guest:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGuest sysGuest)
    {
        startPage();
        List<SysGuest> list = sysGuestService.selectSysGuestList(sysGuest);
        return getDataTable(list);
    }

    /**
     * 导出访客信息表列表
     */
    @PreAuthorize("@ss.hasPermi('guest:guest:export')")
    @Log(title = "访客信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysGuest sysGuest)
    {
        List<SysGuest> list = sysGuestService.selectSysGuestList(sysGuest);
        ExcelUtil<SysGuest> util = new ExcelUtil<SysGuest>(SysGuest.class);
        util.exportExcel(response, list, "访客信息表数据");
    }

    /**
     * 获取访客信息表详细信息
     */
    @PreAuthorize("@ss.hasPermi('guest:guest:query')")
    @GetMapping(value = "/{guestId}")
    public AjaxResult getInfo(@PathVariable("guestId") Long guestId)
    {
        return AjaxResult.success(sysGuestService.selectSysGuestByGuestId(guestId));
    }

    /**
     * 新增访客信息表
     */
    @PreAuthorize("@ss.hasPermi('guest:guest:add')")
    @Log(title = "访客信息表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysGuest sysGuest)
    {
        return toAjax(sysGuestService.insertSysGuest(sysGuest));
    }

    /**
     * 修改访客信息表
     */
    @PreAuthorize("@ss.hasPermi('guest:guest:edit')")
    @Log(title = "访客信息表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysGuest sysGuest)
    {
        return toAjax(sysGuestService.updateSysGuest(sysGuest));
    }

    /**
     * 删除访客信息表
     */
    @PreAuthorize("@ss.hasPermi('guest:guest:remove')")
    @Log(title = "访客信息表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{guestIds}")
    public AjaxResult remove(@PathVariable Long[] guestIds)
    {
        return toAjax(sysGuestService.deleteSysGuestByGuestIds(guestIds));
    }
}
