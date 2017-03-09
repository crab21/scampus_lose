package biz;

import dao.LoadIndexInfoDao;
import entity.Page;
import entity.ShowInfoEntity;
import entity.SubmitInfo;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class ContentBizImpl implements ContentBiz {
    //set注入的方式
    private LoadIndexInfoDao idao;


    public void setIdao(LoadIndexInfoDao idao) {
        this.idao = idao;
    }

    /*
    提交表单信息
     */
    public int SubmitInfo(SubmitInfo submitInfo) {
        return idao.SubmitDao(submitInfo);
    }

    /*
    后台管理  通过ID删除的
     */
    public void deleteByIdBiz(int id) {
        idao.deleteInfoById(id);
    }

    /*
    搜索引擎
     */
    public List SearchByName(String name) {
        return idao.SearchByNameDao(name);
    }

    /*
    加载主页
     */
    public List getIndexInfo(Page p) {
        return idao.loadIndexInfo(p);
    }

    public int PageTotal() {
        return 0;
    }

    /*
    加载单个信息  通过ID
     */
    public ShowInfoEntity getSubmitInfoById(String id) {
        return idao.findSubmitInfoById(id);
    }
}
