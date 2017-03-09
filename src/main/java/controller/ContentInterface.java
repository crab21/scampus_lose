package controller;

import entity.Page;
import entity.SubmitInfo;

import java.util.List;

/**
 * Created by root on 17-2-3.
 */
public interface ContentInterface {
    public int SubmitContent(SubmitInfo submitInfo);
    //public int file(File file);
    public int confirmLose(int id);
    public int getPageTotal();
    public List loadAllLoseInfo(Page p);
    public List manageInfo();
    //public boolean login(User user);
    public List searchLose(String content);
    public void deleteByIdService(int id);
}