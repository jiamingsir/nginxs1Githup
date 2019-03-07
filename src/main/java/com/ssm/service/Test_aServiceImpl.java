package com.ssm.service;

import com.ssm.dao.Test_aDao;
import com.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:Test_aServiceImpl
 * description:
 * author:zz
 * createTime:2019/3/4 上午 11:09
 */
@Service
public class Test_aServiceImpl implements Test_aService {
    @Autowired
    private Test_aDao dao;
/* @Autowired
  private JedisUtil jedisUtil;*/
   /* @Override
    public List<Map> find() {
 Object list = jedisUtil.getObject("list");
 if (list!=null){
     System.out.println("从redis中取出来");
     return (List<Map>)list;
 }else{
     System.out.println("从mysql取");
     List<Map> list1=dao.find();
     jedisUtil.putObject("list",list1);*/


    @Override
    public List<Map> find() {
        List<Map> list1=dao.find();
        return list1;
    }

 }



