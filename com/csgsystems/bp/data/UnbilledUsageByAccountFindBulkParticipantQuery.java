package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnbilledUsageByAccountFindBulkParticipantQuery extends BulkParticipantQuery {

  public UnbilledUsageByAccountFindBulkParticipantQuery (BSDMSessionContext context, UnbilledUsageAccountObjectFilter inFilter) {
    queryName = "UnbilledUsageByAccountFind";
    filter = inFilter;
    this.setContext(context);
  }
  public UnbilledUsageByAccountFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(UnbilledUsageAccountObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return UnbilledUsageAccountObjectHelper.toMap((UnbilledUsageAccountObjectFilter)filter, new HashMap(), "UnbilledUsage");
    }
  }
  public static UnbilledUsageByAccountFindBulkParticipantQuery fromQueryMap(Map input) {
    UnbilledUsageByAccountFindBulkParticipantQuery retVal = new UnbilledUsageByAccountFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnbilledUsageByAccountFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("UnbilledUsage");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(UnbilledUsageAccountObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

