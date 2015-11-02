package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountIdFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountIdFindBulkParticipantQuery (BSDMSessionContext context, AccountIdObjectFilter inFilter) {
    queryName = "AccountIdFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountIdFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountIdObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountIdObjectHelper.toMap((AccountIdObjectFilter)filter, new HashMap(), "AccountId");
    }
  }
  public static AccountIdFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountIdFindBulkParticipantQuery retVal = new AccountIdFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountIdFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountId");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountIdObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

