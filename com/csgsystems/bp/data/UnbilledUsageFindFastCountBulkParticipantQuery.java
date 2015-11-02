package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnbilledUsageFindFastCountBulkParticipantQuery extends BulkParticipantQuery {

  public UnbilledUsageFindFastCountBulkParticipantQuery (BSDMSessionContext context, UnbilledUsageObjectFilter inFilter) {
    queryName = "UnbilledUsageFindFastCount";
    filter = inFilter;
    this.setContext(context);
  }
  public UnbilledUsageFindFastCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(UnbilledUsageObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return UnbilledUsageObjectHelper.toMap((UnbilledUsageObjectFilter)filter, new HashMap(), "UnbilledUsage");
    }
  }
  public static UnbilledUsageFindFastCountBulkParticipantQuery fromQueryMap(Map input) {
    UnbilledUsageFindFastCountBulkParticipantQuery retVal = new UnbilledUsageFindFastCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnbilledUsageFindFastCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("UnbilledUsage");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(UnbilledUsageObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

