package com.example.springcloud.util.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取服务配置工具类，如获取站点IP,端口
 *
 * @author wangyushuai@fang.com
 * @date 2018/12/12
 */

@Component
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {
    /**
     *  服务端口号
     */
    private int serverPort;

    /**
     * 服务器Ip地址
     */
    private String serverIp;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.serverPort = event.getWebServer().getPort();
    }


    public String getServerIp() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            //e.printStackTrace();
            return "UnKnown";
        }
    }

    public int getServerPort() {
        return serverPort;
    }
}
