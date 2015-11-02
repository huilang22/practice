package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RewardBalanceEntityMappingFindBulkParticipantQuery extends BulkParticipantQuery {

  public RewardBalanceEntityMappingFindBulkParticipantQuery (BSDMSessionContext context, RewardBalanceEntityMappingObjectFilter inFilter) {
    queryName = "RewardBalanceEntityMappingFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RewardBalanceEntityMappingFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RewardBalanceEntityMappingObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RewardBalanceEntityMappingObjectHelper.toMap((RewardBalanceEntityMappingObjectFilter)filter, new HashMap(), "RewardBalanceEntityMapping");
    }
  }
  public static RewardBalanceEntityMappingFindBulkParticipantQuery fromQueryMap(Map input) {
    RewardBalanceEntityMappingFindBulkParticipantQuery retVal = new RewardBalanceEntityMappingFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RewardBalanceEntityMappingFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RewardBalanceEntityMapping");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RewardBalanceEntityMappingObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

