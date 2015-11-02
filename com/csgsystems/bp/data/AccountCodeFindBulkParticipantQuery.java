package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountCodeFindBulkParticipantQuery (BSDMSessionContext context, AccountCodeObjectFilter inFilter) {
    queryName = "AccountCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountCodeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountCodeObjectHelper.toMap((AccountCodeObjectFilter)filter, new HashMap(), "AccountCode");
    }
  }
  public static AccountCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountCodeFindBulkParticipantQuery retVal = new AccountCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountCodeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

