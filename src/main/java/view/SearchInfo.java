package view;

import com.opensymphony.xwork2.ActionSupport;
import controller.ContentService;
import entity.ShowInfoEntity;

import java.util.List;

/**
 * Created by root on 17-3-9.
 */
public class SearchInfo extends ActionSupport{
    private String searchInfo;
    private List<ShowInfoEntity> listIndexInfo = null;
    private String count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ShowInfoEntity> getListIndexInfo() {
        return listIndexInfo;
    }

    public void setListIndexInfo(List<ShowInfoEntity> listIndexInfo) {
        this.listIndexInfo = listIndexInfo;
    }

    public String getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
    }




    //    set注入方式
    private ContentService isearch;

    public void setIsearch(ContentService isearch) {
        this.isearch = isearch;
    }

    @Override
    public String execute() throws Exception {
        searchInfo=new String(searchInfo.getBytes("iso-8859-1"),"UTF-8");

        searchInfo.replace(""," ");
        System.out.println("2222222"+searchInfo+"222222222");
        if(searchInfo.equals("")){
            return "index";
        }
        listIndexInfo = isearch.searchLose(searchInfo);
        count = listIndexInfo.size()+"";

        return SUCCESS;
    }
}
