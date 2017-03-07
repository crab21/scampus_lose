package biz;

import entity.Page;
import entity.SubmitInfo;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public interface ContentBiz {
    public List getIndexInfo(Page p);
     public int PageTotal();
    public int SubmitInfo(SubmitInfo submitInfo);

    public  void deleteByIdBiz(int id);
}
