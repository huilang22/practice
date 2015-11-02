package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CorridorFindBulkParticipantQuery extends BulkParticipantQuery {

  public CorridorFindBulkParticipantQuery (BSDMSessionContext context, CorridorObjectFilter inFilter) {
    queryName = "CorridorFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CorridorFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CorridorObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CorridorObjectHelper.toMap((CorridorObjectFilter)filter, new HashMap(), "Corridor");
    }
  }
  public static CorridorFindBulkParticipantQuery fromQueryMap(Map input) {
    CorridorFindBulkParticipantQuery retVal = new CorridorFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CorridorFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Corridor");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CorridorObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

