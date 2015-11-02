package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CorridorRateOverrideFindBulkParticipantQuery extends BulkParticipantQuery {

  public CorridorRateOverrideFindBulkParticipantQuery (BSDMSessionContext context, CROObjectFilter inFilter) {
    queryName = "CorridorRateOverrideFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CorridorRateOverrideFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CROObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CROObjectHelper.toMap((CROObjectFilter)filter, new HashMap(), "CorridorRateOverride");
    }
  }
  public static CorridorRateOverrideFindBulkParticipantQuery fromQueryMap(Map input) {
    CorridorRateOverrideFindBulkParticipantQuery retVal = new CorridorRateOverrideFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CorridorRateOverrideFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CorridorRateOverride");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CROObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

