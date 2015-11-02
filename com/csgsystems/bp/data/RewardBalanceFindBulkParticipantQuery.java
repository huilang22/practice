package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RewardBalanceFindBulkParticipantQuery extends BulkParticipantQuery {

  public RewardBalanceFindBulkParticipantQuery (BSDMSessionContext context, RewardBalanceObjectFilter inFilter) {
    queryName = "RewardBalanceFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RewardBalanceFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RewardBalanceObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RewardBalanceObjectHelper.toMap((RewardBalanceObjectFilter)filter, new HashMap(), "RewardBalance");
    }
  }
  public static RewardBalanceFindBulkParticipantQuery fromQueryMap(Map input) {
    RewardBalanceFindBulkParticipantQuery retVal = new RewardBalanceFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RewardBalanceFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RewardBalance");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RewardBalanceObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

