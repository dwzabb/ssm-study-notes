package com.wdeng.spring.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplOne")
    private BeanInterface beanInterface;

    public void say() {
        if (list != null && !list.isEmpty()) {
            for (BeanInterface bean: list) {
                System.out.println(bean.getClass().getSimpleName());
            }
        }

        System.out.println();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, BeanInterface> entry: map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue().getClass().getName());
            }
        }
        System.out.println();
        System.out.println(beanInterface.getClass().getSimpleName());
    }
}
