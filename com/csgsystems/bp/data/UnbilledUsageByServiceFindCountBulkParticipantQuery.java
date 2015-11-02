package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnbilledUsageByServiceFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public UnbilledUsageByServiceFindCountBulkParticipantQuery (BSDMSessionContext context, UnbilledUsageServiceObjectFilter inFilter) {
    queryName = "UnbilledUsageByServiceFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public UnbilledUsageByServiceFindCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(UnbilledUsageServiceObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return UnbilledUsageServiceObjectHelper.toMap((UnbilledUsageServiceObjectFilter)filter, new HashMap(), "UnbilledUsage");
    }
  }
  public static UnbilledUsageByServiceFindCountBulkParticipantQuery fromQueryMap(Map input) {
    UnbilledUsageByServiceFindCountBulkParticipantQuery retVal = new UnbilledUsageByServiceFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnbilledUsageByServiceFindCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("UnbilledUsage");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(UnbilledUsageServiceObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

