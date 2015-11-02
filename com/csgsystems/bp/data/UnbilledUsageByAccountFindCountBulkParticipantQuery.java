package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnbilledUsageByAccountFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public UnbilledUsageByAccountFindCountBulkParticipantQuery (BSDMSessionContext context, UnbilledUsageAccountObjectFilter inFilter) {
    queryName = "UnbilledUsageByAccountFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public UnbilledUsageByAccountFindCountBulkParticipantQuery () {
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
  public static UnbilledUsageByAccountFindCountBulkParticipantQuery fromQueryMap(Map input) {
    UnbilledUsageByAccountFindCountBulkParticipantQuery retVal = new UnbilledUsageByAccountFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnbilledUsageByAccountFindCount");
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

