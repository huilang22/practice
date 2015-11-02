package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountFindByOrderNumberBulkParticipantQuery extends BulkParticipantQuery {

  public AccountFindByOrderNumberBulkParticipantQuery (BSDMSessionContext context, AccountXIDOrderObjectFilter inFilter) {
    queryName = "AccountFindByOrderNumber";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountFindByOrderNumberBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountXIDOrderObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountXIDOrderObjectHelper.toMap((AccountXIDOrderObjectFilter)filter, new HashMap(), "Account");
    }
  }
  public static AccountFindByOrderNumberBulkParticipantQuery fromQueryMap(Map input) {
    AccountFindByOrderNumberBulkParticipantQuery retVal = new AccountFindByOrderNumberBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountFindByOrderNumber");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Account");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountXIDOrderObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

