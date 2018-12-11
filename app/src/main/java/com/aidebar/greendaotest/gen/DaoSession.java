package com.aidebar.greendaotest.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.cqnu.sunxt.telephonebook.bean.UploadContactBean;

import com.aidebar.greendaotest.gen.UploadContactBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig uploadContactBeanDaoConfig;

    private final UploadContactBeanDao uploadContactBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        uploadContactBeanDaoConfig = daoConfigMap.get(UploadContactBeanDao.class).clone();
        uploadContactBeanDaoConfig.initIdentityScope(type);

        uploadContactBeanDao = new UploadContactBeanDao(uploadContactBeanDaoConfig, this);

        registerDao(UploadContactBean.class, uploadContactBeanDao);
    }
    
    public void clear() {
        uploadContactBeanDaoConfig.clearIdentityScope();
    }

    public UploadContactBeanDao getUploadContactBeanDao() {
        return uploadContactBeanDao;
    }

}