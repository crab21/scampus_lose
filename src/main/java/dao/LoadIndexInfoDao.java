package dao;

import entity.Page;
import entity.ShowInfoEntity;
import entity.SubmitInfo;
import org.apache.struts2.components.Submit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.Date;
import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class LoadIndexInfoDao extends HibernateDaoSupport {

    public List loadIndexInfo(Page p) {
        Session session = this.getSessionFactory().openSession();
//        List list = super.getHibernateTemplate().find("from entity.ShowInfoEntity");

        String hql = "from entity.ShowInfoEntity b where b.lcid=0 order by lid desc ";

//        分页查询
        Query query = session.createQuery(hql);
        if (p.getTotal() != 100) {
            query.setFirstResult(p.getpSize() * (p.getPage() - 1));
            query.setMaxResults(p.getpSize());
        }


        List list = query.list();

        session.close();
        return list;


    }

    public int SubmitDao(SubmitInfo submitInfo) {
        Session session = this.getSessionFactory().openSession();
        ShowInfoEntity showInfoEntity = new ShowInfoEntity();
        showInfoEntity.setLcid(0);
        showInfoEntity.setLoseInfo(submitInfo.getLose_info());
        showInfoEntity.setLoseLocation(submitInfo.getLose_location());
        showInfoEntity.setLoseName(submitInfo.getLose_name());
        showInfoEntity.setLosePhone(submitInfo.getLose_phone());
        showInfoEntity.setLoseType(submitInfo.getLose_type());
        showInfoEntity.setLoseTime(new Date().toLocaleString());
        showInfoEntity.setLscount(0);
        showInfoEntity.setLoseImg(submitInfo.getLose_img());
        Transaction tx = session.beginTransaction();
        int a = (Integer) session.save(showInfoEntity);
        tx.commit();
        session.close();
        return a;

    }

    public ShowInfoEntity findSubmitInfoById(String id) {
        Session session = this.getSessionFactory().openSession();

        ShowInfoEntity submitInfo = (ShowInfoEntity) session.get(ShowInfoEntity.class, Integer.parseInt(id));
        session.close();

        return submitInfo;

    }

    public void deleteInfoById(int id){
        Session session = this.getSessionFactory().openSession();
        ShowInfoEntity submitInfo = (ShowInfoEntity) session.get(ShowInfoEntity.class, (id));
        Transaction tx = session.beginTransaction();
        session.delete(submitInfo);
        tx.commit();
        session.close();

    }
    public int getPTotal() {

        return 4;
    }


    public List SearchByNameDao(String searchInfo){
        Session session = this.getSessionFactory().openSession();
//        List list = super.getHibernateTemplate().find("from entity.ShowInfoEntity");

        String hql = "from entity.ShowInfoEntity b where b.lcid=0 and b.loseName=? order by lid desc ";

//        分页查询
        Query query = session.createQuery(hql);
        //条件查询用query.set....
        query.setString(0,searchInfo);

        List list = query.list();

        session.close();
        return list;
    }
}
