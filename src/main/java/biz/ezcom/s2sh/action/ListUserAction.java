package biz.ezcom.s2sh.action;

import java.util.List;
import java.util.Map;

import biz.ezcom.s2sh.po.User;
import biz.ezcom.s2sh.service.api.IUserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListUserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private IUserService       userService;

    public IUserService getUserService() {
        return this.userService;
    }

    public void setUserService(final IUserService userService) {
        this.userService = userService;
    }

    @SuppressWarnings("unchecked")
    @Override
    public String execute() throws Exception {
        final List<User> userList = this.userService.findAllUsers();
        final Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
        request.put("list", userList);
        return Action.SUCCESS;
    }
}
