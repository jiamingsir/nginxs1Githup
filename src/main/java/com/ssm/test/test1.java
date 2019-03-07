package com.ssm.test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * fileName:Test1
 * description:
 * author:zz
 * createTime:2019/3/4 下午 8:19
 */
public class test1 {
    public static void main(String[] args) {
        /*Set<HostAndPort> nodes=new HashSet<>();

        nodes.add(new HostAndPort("192.168.65.50",7001));
        nodes.add(new HostAndPort("192.168.65.50",7002));
        nodes.add(new HostAndPort("192.168.65.50",7003));
        nodes.add(new HostAndPort("192.168.65.70",7004));
        nodes.add(new HostAndPort("192.168.65.70",7005));
        nodes.add(new HostAndPort("192.168.65.70",7006));

        JedisCluster jedisCluster=new JedisCluster(nodes);
        jedisCluster.set("aaa","123");
        System.out.println("aaa:are you ok ?");

        String s=jedisCluster.get("aaa");
        System.out.println(s);*/
        Set<HostAndPort> hps=new HashSet();
        hps.add(new HostAndPort("192.168.64.50",7001));
        hps.add(new HostAndPort("192.168.64.50",7002));
        hps.add(new HostAndPort("192.168.64.50",7003));
        hps.add(new HostAndPort("192.168.64.70",7004));
        hps.add(new HostAndPort("192.168.64.70",7005));
        hps.add(new HostAndPort("192.168.64.70",7006));

        JedisCluster jedisCluster=new JedisCluster(hps);
        // System.out.println(jedisCluster.ping());
        jedisCluster.set("eee","555");
        String eee= jedisCluster.get("eee");
        System.out.println( eee);

    }
}
