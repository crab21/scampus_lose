package view;

import com.opensymphony.xwork2.ActionSupport;
import controller.ContentService;
import entity.ShowInfoEntity;
import entity.SubmitInfo;

import java.util.Date;

/**
 * Created by root on 17-3-5.
 */
public class ContentOne extends ActionSupport {
    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    private String lid;
    private ContentService contentService;

    public void setContentService(ContentService contentService) {
        this.contentService = contentService;
    }
    private ShowInfoEntity submitInfo;

    public ShowInfoEntity getSubmitInfo() {
        return submitInfo;
    }

    public void setSubmitInfo(ShowInfoEntity submitInfo) {
        this.submitInfo = submitInfo;
    }

    @Override
    public String execute() throws Exception {
        submitInfo = contentService.findSubmitInfoById(lid);
        return "ok";
    }
}

