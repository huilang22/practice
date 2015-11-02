package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AdjustmentFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public AdjustmentFindCountBulkParticipantQuery (BSDMSessionContext context, AdjustmentObjectFilter inFilter) {
    queryName = "AdjustmentFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public AdjustmentFindCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AdjustmentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AdjustmentObjectHelper.toMap((AdjustmentObjectFilter)filter, new HashMap(), "Adjustment");
    }
  }
  public static AdjustmentFindCountBulkParticipantQuery fromQueryMap(Map input) {
    AdjustmentFindCountBulkParticipantQuery retVal = new AdjustmentFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AdjustmentFindCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Adjustment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AdjustmentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

