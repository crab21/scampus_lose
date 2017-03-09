package view;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import controller.ContentService;
import entity.SubmitInfo;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by root on 17-2-11.
 */
public class SubmitInfoAction extends ActionSupport {
    private SubmitInfo sub;

    public SubmitInfo getSub() {
        return sub;
    }

    public void setSub(SubmitInfo sub) {
        this.sub = sub;
    }

    //    set zhuru
    private ContentService contentService;

    public void setContentService(ContentService contentService) {
        this.contentService = contentService;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("222222");
//        sub.setLose_img(name);
        System.out.println(sub.getLose_type());
        contentService.SubmitContent(sub);

        return "submit_ok";
    }
}
