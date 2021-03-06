package com.card.shuttle.common.module.mybatis.paginator.dialect;


import com.card.shuttle.common.module.mybatis.paginator.domain.PageBounds;
import org.apache.ibatis.mapping.MappedStatement;

/**
 * A dialect compatible with the H2 database.
 */
public class H2Dialect extends Dialect {

    public H2Dialect(MappedStatement mappedStatement, Object parameterObject, PageBounds pageBounds) {
        super(mappedStatement, parameterObject, pageBounds);
    }

    protected String getLimitString(String sql, String offsetName,int offset, String limitName, int limit) {
		return new StringBuffer(sql.length() + 40).
			append(sql).
			append((offset > 0) ? " limit "+String.valueOf(limit)+" offset "+String.valueOf(offset) : " limit "+String.valueOf(limit)).
			toString();
	}


}