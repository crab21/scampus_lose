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

    /*
    确认信息  暂时没用
     */
    public int confirmLose(int id) {
        return 0;
    }

    /*
    确认信息  暂时没用
     */
    public int getPageTotal() {
        return iservice.PageTotal();
    }

    /*
    加载  通过id获取   单个信息
     */
    public ShowInfoEntity findSubmitInfoById(String id) {
        return iservice.getSubmitInfoById(id);

    }
    /*
    加载主页信息
     */
    public List loadAllLoseInfo(Page p) {
        return iservice.getIndexInfo(p);
    }

    /*
    暂时没用
     */
    public List manageInfo() {
        return null;
    }

    /*
        public boolean login(User user) {
            return false;
        }    */
    /*
    搜索引擎
     */
    public List searchLose(String content) {
        return iservice.SearchByName(content);
    }

    /*
    后台管理删除账号
     */
    public void deleteByIdService(int id) {
        iservice.deleteByIdBiz(id);
    }
}
