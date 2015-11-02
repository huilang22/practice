package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountBalancesFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountBalancesFindBulkParticipantQuery (BSDMSessionContext context, AccountBalancesObjectFilter inFilter) {
    queryName = "AccountBalancesFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountBalancesFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountBalancesObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountBalancesObjectHelper.toMap((AccountBalancesObjectFilter)filter, new HashMap(), "AccountBalances");
    }
  }
  public static AccountBalancesFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountBalancesFindBulkParticipantQuery retVal = new AccountBalancesFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountBalancesFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountBalances");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountBalancesObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

