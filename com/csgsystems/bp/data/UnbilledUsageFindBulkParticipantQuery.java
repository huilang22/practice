package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnbilledUsageFindBulkParticipantQuery extends BulkParticipantQuery {

  public UnbilledUsageFindBulkParticipantQuery (BSDMSessionContext context, UnbilledUsageObjectFilter inFilter) {
    queryName = "UnbilledUsageFind";
    filter = inFilter;
    this.setContext(context);
  }
  public UnbilledUsageFindBulkParticipantQuery () {
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
  public static UnbilledUsageFindBulkParticipantQuery fromQueryMap(Map input) {
    UnbilledUsageFindBulkParticipantQuery retVal = new UnbilledUsageFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnbilledUsageFind");
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

