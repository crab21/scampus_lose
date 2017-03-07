package view;

import com.opensymphony.xwork2.ActionSupport;
import controller.ContentService;
import entity.Page;

/**
 * Created by root on 17-3-7.
 */
public class DeleteInfo extends ActionSupport {
    private Page p = new Page();

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
        System.out.println("fdasfdfasdafsfdsfasdf");
        System.out.println(p.getTotal());
        iaction.deleteByIdService(p.getTotal());
        return "delOk";
    }
}
