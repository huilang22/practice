package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountStatusFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountStatusFindBulkParticipantQuery (BSDMSessionContext context, AccountStatusObjectFilter inFilter) {
    queryName = "AccountStatusFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountStatusFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountStatusObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountStatusObjectHelper.toMap((AccountStatusObjectFilter)filter, new HashMap(), "AccountStatus");
    }
  }
  public static AccountStatusFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountStatusFindBulkParticipantQuery retVal = new AccountStatusFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountStatusFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountStatus");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountStatusObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

