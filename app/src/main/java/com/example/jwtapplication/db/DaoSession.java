package com.example.jwtapplication.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.jwtapplication.dao.Token;

import com.example.jwtapplication.db.TokenDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig tokenDaoConfig;

    private final TokenDao tokenDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        tokenDaoConfig = daoConfigMap.get(TokenDao.class).clone();
        tokenDaoConfig.initIdentityScope(type);

        tokenDao = new TokenDao(tokenDaoConfig, this);

        registerDao(Token.class, tokenDao);
    }
    
    public void clear() {
        tokenDaoConfig.clearIdentityScope();
    }

    public TokenDao getTokenDao() {
        return tokenDao;
    }

}
