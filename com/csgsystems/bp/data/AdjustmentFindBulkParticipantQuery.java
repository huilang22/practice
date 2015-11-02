package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AdjustmentFindBulkParticipantQuery extends BulkParticipantQuery {

  public AdjustmentFindBulkParticipantQuery (BSDMSessionContext context, AdjustmentObjectFilter inFilter) {
    queryName = "AdjustmentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AdjustmentFindBulkParticipantQuery () {
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
  public static AdjustmentFindBulkParticipantQuery fromQueryMap(Map input) {
    AdjustmentFindBulkParticipantQuery retVal = new AdjustmentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AdjustmentFind");
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

