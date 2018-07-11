package com.sugar.memcached;

import com.sugar.beans.BW003Bean;
import com.sugar.tools.JsonTools;
import net.spy.memcached.MemcachedClient;
import org.apache.log4j.Logger;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

/**
 * Created by TangSu on 2017/5/26.
 */
public class MemcachedJava {
    private static final Logger logger = Logger.getLogger(MemcachedJava.class);
    public static void main(String[] args){
        try{
            MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1",11211));
            logger.debug("=======================Connection to Server successful");

            //存储数据
            Future fo = mcc.set("test",900,"myFirstMemcached");

            //存储状态
            logger.debug("=======================set Status :"+fo.get());

            logger.debug("=======================value: "+mcc.get("value"));

            //输出值
            logger.debug("=======================test value in caches :"+mcc.get("test"));

            BW003Bean bean = new BW003Bean();
            bean.setBWNR001("this is the content.");
            bean.setBWID001("111111");
            mcc.add("bean",900, JsonTools.getStringFromObject(bean));

            BW003Bean newBean = JsonTools.getObjectFromString(mcc.get("bean").toString());
            logger.debug("======BWID001:"+newBean.getBWID001()+"  BWNR001:"+newBean.getBWNR001());

            mcc.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
