package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnbilledUsageByServiceFindBulkParticipantQuery extends BulkParticipantQuery {

  public UnbilledUsageByServiceFindBulkParticipantQuery (BSDMSessionContext context, UnbilledUsageServiceObjectFilter inFilter) {
    queryName = "UnbilledUsageByServiceFind";
    filter = inFilter;
    this.setContext(context);
  }
  public UnbilledUsageByServiceFindBulkParticipantQuery () {
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
  public static UnbilledUsageByServiceFindBulkParticipantQuery fromQueryMap(Map input) {
    UnbilledUsageByServiceFindBulkParticipantQuery retVal = new UnbilledUsageByServiceFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnbilledUsageByServiceFind");
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

