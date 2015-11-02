package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GlobalOpenItemIdMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public GlobalOpenItemIdMapFindBulkParticipantQuery (BSDMSessionContext context, GlobalOpenItemIdMapObjectFilter inFilter) {
    queryName = "GlobalOpenItemIdMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GlobalOpenItemIdMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GlobalOpenItemIdMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GlobalOpenItemIdMapObjectHelper.toMap((GlobalOpenItemIdMapObjectFilter)filter, new HashMap(), "GlobalOpenItemIdMap");
    }
  }
  public static GlobalOpenItemIdMapFindBulkParticipantQuery fromQueryMap(Map input) {
    GlobalOpenItemIdMapFindBulkParticipantQuery retVal = new GlobalOpenItemIdMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GlobalOpenItemIdMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GlobalOpenItemIdMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GlobalOpenItemIdMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

