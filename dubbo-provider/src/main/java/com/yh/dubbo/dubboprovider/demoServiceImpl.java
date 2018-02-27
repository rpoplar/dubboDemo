package com.yh.dubbo.dubboprovider;
import com.yh.dubbo.dubboapi.demoService;

import java.util.ArrayList;
import java.util.List;

public class demoServiceImpl implements demoService{
    @Override
    public List<String> sayHello(long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
