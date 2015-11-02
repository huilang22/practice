package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountMessageFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountMessageFindBulkParticipantQuery (BSDMSessionContext context, AccountMessageObjectFilter inFilter) {
    queryName = "AccountMessageFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountMessageFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountMessageObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountMessageObjectHelper.toMap((AccountMessageObjectFilter)filter, new HashMap(), "AccountMessage");
    }
  }
  public static AccountMessageFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountMessageFindBulkParticipantQuery retVal = new AccountMessageFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountMessageFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountMessage");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountMessageObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

