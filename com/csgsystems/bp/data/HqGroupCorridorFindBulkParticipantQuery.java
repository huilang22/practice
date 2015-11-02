package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqGroupCorridorFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqGroupCorridorFindBulkParticipantQuery (BSDMSessionContext context, HqGroupCorridorObjectFilter inFilter) {
    queryName = "HqGroupCorridorFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqGroupCorridorFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqGroupCorridorObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqGroupCorridorObjectHelper.toMap((HqGroupCorridorObjectFilter)filter, new HashMap(), "HqGroupCorridor");
    }
  }
  public static HqGroupCorridorFindBulkParticipantQuery fromQueryMap(Map input) {
    HqGroupCorridorFindBulkParticipantQuery retVal = new HqGroupCorridorFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqGroupCorridorFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqGroupCorridor");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqGroupCorridorObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

