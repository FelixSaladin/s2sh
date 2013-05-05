package biz.ezcom.s2sh.action;

import biz.ezcom.s2sh.po.User;
import biz.ezcom.s2sh.service.api.IUserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private User              user;
    private IUserService       userService;

    public User getUser() {
        return this.user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return this.userService;
    }

    public void setUserService(final IUserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        this.user = this.userService.findUserById(this.user.getId());
        return Action.SUCCESS;
    }
}
