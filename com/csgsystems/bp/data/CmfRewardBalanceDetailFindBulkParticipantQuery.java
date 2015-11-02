package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CmfRewardBalanceDetailFindBulkParticipantQuery extends BulkParticipantQuery {

  public CmfRewardBalanceDetailFindBulkParticipantQuery (BSDMSessionContext context, CmfRewardBalanceDetailObjectFilter inFilter) {
    queryName = "CmfRewardBalanceDetailFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CmfRewardBalanceDetailFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CmfRewardBalanceDetailObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CmfRewardBalanceDetailObjectHelper.toMap((CmfRewardBalanceDetailObjectFilter)filter, new HashMap(), "CmfRewardBalanceDetail");
    }
  }
  public static CmfRewardBalanceDetailFindBulkParticipantQuery fromQueryMap(Map input) {
    CmfRewardBalanceDetailFindBulkParticipantQuery retVal = new CmfRewardBalanceDetailFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CmfRewardBalanceDetailFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CmfRewardBalanceDetail");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CmfRewardBalanceDetailObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

