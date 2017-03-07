package controller;

import biz.ContentBizImpl;
import entity.Page;
import entity.ShowInfoEntity;
import entity.SubmitInfo;

import java.util.List;

/**
 * Created by root on 17-2-3.
 */
public class ContentService implements ContentInterface {
    private ContentBizImpl iservice;

    public void setIservice(ContentBizImpl iservice) {
        this.iservice = iservice;
    }

    public int SubmitContent(SubmitInfo submitInfo) {
        return iservice.SubmitInfo(submitInfo);
    }

    public int confirmLose(int id) {
        return 0;
    }

    public int getPageTotal() {
        return iservice.PageTotal();
    }

    public ShowInfoEntity findSubmitInfoById(String id) {
        return iservice.getSubmitInfoById(id);

    }

    public List loadAllLoseInfo(Page p) {
        return iservice.getIndexInfo(p);
    }

    public List manageInfo() {
        return null;
    }

    /*
        public boolean login(User user) {
            return false;
        }    */
    public List searchLose(String content) {
        return null;
    }

    public void deleteByIdService(int id) {
        iservice.deleteByIdBiz(id);
    }
}
