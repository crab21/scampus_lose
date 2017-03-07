package view;

import com.opensymphony.xwork2.ActionSupport;
import entity.Page;
import entity.ShowInfoEntity;

import controller.ContentService;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class LoadContentAction extends ActionSupport {
    private List<ShowInfoEntity> listIndexInfo = null;
    private Page p = new Page();

    public Page getP() {
        return p;
    }

    public void setP(Page p) {
        this.p = p;
    }

    public List<ShowInfoEntity> getListIndexInfo() {
        return listIndexInfo;
    }

    public void setListIndexInfo(List<ShowInfoEntity> listIndexInfo) {
        this.listIndexInfo = listIndexInfo;
    }

    //    set注入方式
    private ContentService iaction;

    public void setIaction(ContentService iaction) {
        this.iaction = iaction;
    }

//    private static Logger logger = Logger.getLogger(LoadContentAction.class.getName());

    /*
    加载主页的内容的
    配合【加载更多】的按钮使用的
 */
    @Override
    public String execute() throws Exception {
        listIndexInfo = iaction.loadAllLoseInfo(p);
        int listSize = listIndexInfo.size();
        p.setTotal(listSize);
        if(listSize == 0){
            return  "NoInfo";
        }
        return "index_info";
    }
}
