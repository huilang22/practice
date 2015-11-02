package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BilledUsageFindBulkParticipantQuery extends BulkParticipantQuery {

  public BilledUsageFindBulkParticipantQuery (BSDMSessionContext context, BilledUsageObjectFilter inFilter) {
    queryName = "BilledUsageFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BilledUsageFindBulkParticipantQuery () {
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
  public static BilledUsageFindBulkParticipantQuery fromQueryMap(Map input) {
    BilledUsageFindBulkParticipantQuery retVal = new BilledUsageFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BilledUsageFind");
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

