package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RefinancePlanFindBulkParticipantQuery extends BulkParticipantQuery {

  public RefinancePlanFindBulkParticipantQuery (BSDMSessionContext context, RefinancePlanObjectFilter inFilter) {
    queryName = "RefinancePlanFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RefinancePlanFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RefinancePlanObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RefinancePlanObjectHelper.toMap((RefinancePlanObjectFilter)filter, new HashMap(), "RefinancePlan");
    }
  }
  public static RefinancePlanFindBulkParticipantQuery fromQueryMap(Map input) {
    RefinancePlanFindBulkParticipantQuery retVal = new RefinancePlanFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RefinancePlanFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RefinancePlan");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RefinancePlanObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

