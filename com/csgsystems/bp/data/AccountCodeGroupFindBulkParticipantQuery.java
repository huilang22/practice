package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountCodeGroupFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountCodeGroupFindBulkParticipantQuery (BSDMSessionContext context, AccountCodeGroupObjectFilter inFilter) {
    queryName = "AccountCodeGroupFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountCodeGroupFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountCodeGroupObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountCodeGroupObjectHelper.toMap((AccountCodeGroupObjectFilter)filter, new HashMap(), "AccountCodeGroup");
    }
  }
  public static AccountCodeGroupFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountCodeGroupFindBulkParticipantQuery retVal = new AccountCodeGroupFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountCodeGroupFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountCodeGroup");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountCodeGroupObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

