package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CorridorRateBandOverrideFindBulkParticipantQuery extends BulkParticipantQuery {

  public CorridorRateBandOverrideFindBulkParticipantQuery (BSDMSessionContext context, CRBOObjectFilter inFilter) {
    queryName = "CorridorRateBandOverrideFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CorridorRateBandOverrideFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CRBOObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CRBOObjectHelper.toMap((CRBOObjectFilter)filter, new HashMap(), "CorridorRateBandOverride");
    }
  }
  public static CorridorRateBandOverrideFindBulkParticipantQuery fromQueryMap(Map input) {
    CorridorRateBandOverrideFindBulkParticipantQuery retVal = new CorridorRateBandOverrideFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CorridorRateBandOverrideFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CorridorRateBandOverride");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CRBOObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

