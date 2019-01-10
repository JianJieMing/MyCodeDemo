package com.jianjieming.demo.uflodemo01;

import com.bstek.uflo.env.EnvironmentProvider;
import org.hibernate.SessionFactory;
import org.springframework.transaction.PlatformTransactionManager;
public class EnvironmentProviderImpl implements EnvironmentProvider {
    private SessionFactory sessionFactory;
    private PlatformTransactionManager platformTransactionManager;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public PlatformTransactionManager getPlatformTransactionManager() {
        return platformTransactionManager;
    }

    public void setPlatformTransactionManager(
            PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }
    public String getCategoryId() {
        return null;
    }
    public String getLoginUser() {
        return "anonymous";
    }
}