package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqGroupProductFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqGroupProductFindBulkParticipantQuery (BSDMSessionContext context, HqGroupProductObjectFilter inFilter) {
    queryName = "HqGroupProductFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqGroupProductFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqGroupProductObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqGroupProductObjectHelper.toMap((HqGroupProductObjectFilter)filter, new HashMap(), "HqGroupProduct");
    }
  }
  public static HqGroupProductFindBulkParticipantQuery fromQueryMap(Map input) {
    HqGroupProductFindBulkParticipantQuery retVal = new HqGroupProductFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqGroupProductFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqGroupProduct");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqGroupProductObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

