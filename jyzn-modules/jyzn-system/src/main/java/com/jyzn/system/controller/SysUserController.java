package com.jyzn.system.controller;

import com.jyzn.common.core.domain.R;
import com.jyzn.common.core.utils.StringUtils;
import com.jyzn.common.core.web.controller.BaseController;
import com.jyzn.common.core.web.domain.AjaxResult;
import com.jyzn.common.security.utils.SecurityUtils;
import com.jyzn.system.api.domain.SysUser;
import com.jyzn.system.api.model.LoginUser;
import com.jyzn.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * 用户信息
 * 
 * @author jyzn
 */
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController
{
    @Autowired
    private ISysUserService userService;






    /**
     * 获取当前用户信息
     */
    @GetMapping("/info/{username}")
    public R<LoginUser> info(@PathVariable("username") String username)
    {
        SysUser sysUser = userService.selectUserByUserName(username);
        if (StringUtils.isNull(sysUser))
        {
            return R.fail("用户名或密码错误");
        }
        LoginUser sysUserVo = new LoginUser();
        sysUserVo.setSysUser(sysUser);
        return R.ok(sysUserVo);
    }


    /**
     * 获取用户信息
     * 
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo()
    {
        Long userId = SecurityUtils.getUserId();
        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", userService.selectUserById(userId));
        return ajax;
    }





}
