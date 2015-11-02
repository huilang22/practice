package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountInsertFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountInsertFindBulkParticipantQuery (BSDMSessionContext context, AccountInsertObjectFilter inFilter) {
    queryName = "AccountInsertFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountInsertFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountInsertObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountInsertObjectHelper.toMap((AccountInsertObjectFilter)filter, new HashMap(), "AccountInsert");
    }
  }
  public static AccountInsertFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountInsertFindBulkParticipantQuery retVal = new AccountInsertFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountInsertFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountInsert");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountInsertObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

