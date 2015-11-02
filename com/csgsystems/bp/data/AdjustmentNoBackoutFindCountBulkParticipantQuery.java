package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AdjustmentNoBackoutFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public AdjustmentNoBackoutFindCountBulkParticipantQuery (BSDMSessionContext context, AdjustmentObjectFilter inFilter) {
    queryName = "AdjustmentNoBackoutFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public AdjustmentNoBackoutFindCountBulkParticipantQuery () {
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
  public static AdjustmentNoBackoutFindCountBulkParticipantQuery fromQueryMap(Map input) {
    AdjustmentNoBackoutFindCountBulkParticipantQuery retVal = new AdjustmentNoBackoutFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AdjustmentNoBackoutFindCount");
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

