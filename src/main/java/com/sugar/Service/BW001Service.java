package com.sugar.Service;

import com.sugar.beans.BW003Bean;
import com.sugar.mapper.Bw001Mapper;
import com.sugar.tools.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by TangSu on 2017/5/23.
 */
public class BW001Service {
    public static void main(String[] args){
//        updateBw001();
//        selectUserById();
//        deleteBw001();
//        insertBw001();
        System.out.print("x^2");
    }

    private static void selectUserById(){
        SqlSession session= DBTools.getSession();
        Bw001Mapper mapper=session.getMapper(Bw001Mapper.class);
        try {
            BW003Bean user= mapper.selectBwById("22");
            System.out.println(user.toString());

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    private static void updateBw001(){
        SqlSession session= DBTools.getSession();
        Bw001Mapper mapper=session.getMapper(Bw001Mapper.class);
        try {
            BW003Bean bean = new BW003Bean();
            bean.setBWID001("22");
            bean.setBWNR001("22222222222222222222222");
            mapper.updateBw001(bean);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    public static void deleteBw001(String id){
        SqlSession session = DBTools.getSession();
        Bw001Mapper mapper = session.getMapper(Bw001Mapper.class);
        try{
            BW003Bean bean = new BW003Bean();
            bean.setBWID001(id);
            mapper.deleteBw001(bean);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }
    }

    private static void insertBw001(){
        SqlSession session = DBTools.getSession();
        Bw001Mapper mapper = session.getMapper(Bw001Mapper.class);

        try{
            BW003Bean bean = new BW003Bean();
            bean.setBWID001("67");
            bean.setBWNR001("3333333333");
            mapper.insertBw001(bean);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }
    }

    public List<BW003Bean> selectAll(){
        SqlSession session = DBTools.getSession();
        Bw001Mapper mapper = session.getMapper(Bw001Mapper.class);
        List<BW003Bean> list = new LinkedList<BW003Bean>();

        try{
            BW003Bean bean  = new BW003Bean();
            list = mapper.selectAll(bean);
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }finally {
            return list;
        }
    }
}
