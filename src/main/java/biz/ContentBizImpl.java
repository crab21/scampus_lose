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
    private LoadIndexInfoDao idao;



    public void setIdao(LoadIndexInfoDao idao) {
        this.idao = idao;
    }

    public int SubmitInfo(SubmitInfo submitInfo) {
        return idao.SubmitDao(submitInfo);
    }

    public void deleteByIdBiz(int id) {
         idao.deleteInfoById(id);
    }

    public List getIndexInfo(Page p) {
        return idao.loadIndexInfo(p);
    }

    public int PageTotal() {
        return 0;
    }
    public ShowInfoEntity getSubmitInfoById(String id){
        return idao.findSubmitInfoById(id);
    }
}
