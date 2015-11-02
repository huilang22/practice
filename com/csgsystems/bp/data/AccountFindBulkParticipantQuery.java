package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountFindBulkParticipantQuery (BSDMSessionContext context, AccountXIDObjectFilter inFilter) {
    queryName = "AccountFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountXIDObjectHelper.toMap((AccountXIDObjectFilter)filter, new HashMap(), "Account");
    }
  }
  public static AccountFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountFindBulkParticipantQuery retVal = new AccountFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Account");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

