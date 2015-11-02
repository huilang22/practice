package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GlobalAccountBalancesFindBulkParticipantQuery extends BulkParticipantQuery {

  public GlobalAccountBalancesFindBulkParticipantQuery (BSDMSessionContext context, GlobalAccountBalancesObjectFilter inFilter) {
    queryName = "GlobalAccountBalancesFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GlobalAccountBalancesFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GlobalAccountBalancesObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GlobalAccountBalancesObjectHelper.toMap((GlobalAccountBalancesObjectFilter)filter, new HashMap(), "GlobalAccountBalances");
    }
  }
  public static GlobalAccountBalancesFindBulkParticipantQuery fromQueryMap(Map input) {
    GlobalAccountBalancesFindBulkParticipantQuery retVal = new GlobalAccountBalancesFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GlobalAccountBalancesFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GlobalAccountBalances");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GlobalAccountBalancesObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

