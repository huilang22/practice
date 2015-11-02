package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountAbiSourceFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountAbiSourceFindBulkParticipantQuery (BSDMSessionContext context, AccountAbiSourceObjectFilter inFilter) {
    queryName = "AccountAbiSourceFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountAbiSourceFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountAbiSourceObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountAbiSourceObjectHelper.toMap((AccountAbiSourceObjectFilter)filter, new HashMap(), "AccountAbiSource");
    }
  }
  public static AccountAbiSourceFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountAbiSourceFindBulkParticipantQuery retVal = new AccountAbiSourceFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountAbiSourceFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountAbiSource");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountAbiSourceObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

