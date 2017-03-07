package view;

import com.opensymphony.xwork2.ActionSupport;
import controller.ContentService;
import entity.Page;
import entity.ShowInfoEntity;

import java.util.List;

/**
 * Created by root on 17-3-7.
 */

public class ManageAction extends ActionSupport {
    private List<ShowInfoEntity> list;
    private Page p = new Page();

    public List<ShowInfoEntity> getList() {
        return list;
    }

    public void setList(List<ShowInfoEntity> list) {
        this.list = list;
    }

    public Page getP() {
        return p;
    }

    public void setP(Page p) {
        this.p = p;
    }

    //    set注入方式
    private ContentService iaction;

    public void setIaction(ContentService iaction) {
        this.iaction = iaction;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("11111111111111");
        p.setTotal(100);
        list = iaction.loadAllLoseInfo(p);
        System.out.println("11111111111111");

        return "manage";
    }

    public String manage_load() {

        return "manage";
    }

    public String deleteById(){

        return manage_load();
    }
}
