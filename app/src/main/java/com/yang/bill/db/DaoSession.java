package com.yang.bill.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yang.bill.model.bean.local.BBill;
import com.yang.bill.model.bean.local.BPay;
import com.yang.bill.model.bean.local.BSort;
import com.yang.bill.model.bean.remote.User;

import com.yang.bill.db.BBillDao;
import com.yang.bill.db.BPayDao;
import com.yang.bill.db.BSortDao;
import com.yang.bill.db.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bBillDaoConfig;
    private final DaoConfig bPayDaoConfig;
    private final DaoConfig bSortDaoConfig;
    private final DaoConfig userDaoConfig;

    private final BBillDao bBillDao;
    private final BPayDao bPayDao;
    private final BSortDao bSortDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bBillDaoConfig = daoConfigMap.get(BBillDao.class).clone();
        bBillDaoConfig.initIdentityScope(type);

        bPayDaoConfig = daoConfigMap.get(BPayDao.class).clone();
        bPayDaoConfig.initIdentityScope(type);

        bSortDaoConfig = daoConfigMap.get(BSortDao.class).clone();
        bSortDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        bBillDao = new BBillDao(bBillDaoConfig, this);
        bPayDao = new BPayDao(bPayDaoConfig, this);
        bSortDao = new BSortDao(bSortDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(BBill.class, bBillDao);
        registerDao(BPay.class, bPayDao);
        registerDao(BSort.class, bSortDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        bBillDaoConfig.clearIdentityScope();
        bPayDaoConfig.clearIdentityScope();
        bSortDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public BBillDao getBBillDao() {
        return bBillDao;
    }

    public BPayDao getBPayDao() {
        return bPayDao;
    }

    public BSortDao getBSortDao() {
        return bSortDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
