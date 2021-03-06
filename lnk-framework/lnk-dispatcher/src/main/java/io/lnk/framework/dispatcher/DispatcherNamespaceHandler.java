package io.lnk.framework.dispatcher;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author 刘飞 E-mail:liufei_it@126.com
 *
 * @version 1.0.0
 * @since 2017年1月1日 下午4:35:51
 */
public class DispatcherNamespaceHandler extends NamespaceHandlerSupport {
    
    public void init() {
        registerBeanDefinitionParser("dispatcher", new DispatcherParser());
    }
}