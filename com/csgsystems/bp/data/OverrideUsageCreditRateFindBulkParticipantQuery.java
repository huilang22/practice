package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class OverrideUsageCreditRateFindBulkParticipantQuery extends BulkParticipantQuery {

  public OverrideUsageCreditRateFindBulkParticipantQuery (BSDMSessionContext context, RUCOverrideObjectFilter inFilter) {
    queryName = "OverrideUsageCreditRateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public OverrideUsageCreditRateFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RUCOverrideObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RUCOverrideObjectHelper.toMap((RUCOverrideObjectFilter)filter, new HashMap(), "OverrideUsageCreditRate");
    }
  }
  public static OverrideUsageCreditRateFindBulkParticipantQuery fromQueryMap(Map input) {
    OverrideUsageCreditRateFindBulkParticipantQuery retVal = new OverrideUsageCreditRateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("OverrideUsageCreditRateFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("OverrideUsageCreditRate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RUCOverrideObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

