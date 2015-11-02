package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BilledUsageFindSummaryCountBulkParticipantQuery extends BulkParticipantQuery {

  public BilledUsageFindSummaryCountBulkParticipantQuery (BSDMSessionContext context, BilledUsageObjectFilter inFilter) {
    queryName = "BilledUsageFindSummaryCount";
    filter = inFilter;
    this.setContext(context);
  }
  public BilledUsageFindSummaryCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BilledUsageObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BilledUsageObjectHelper.toMap((BilledUsageObjectFilter)filter, new HashMap(), "BilledUsage");
    }
  }
  public static BilledUsageFindSummaryCountBulkParticipantQuery fromQueryMap(Map input) {
    BilledUsageFindSummaryCountBulkParticipantQuery retVal = new BilledUsageFindSummaryCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BilledUsageFindSummaryCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BilledUsage");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BilledUsageObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

