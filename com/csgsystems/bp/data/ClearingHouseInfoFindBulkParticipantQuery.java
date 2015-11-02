package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ClearingHouseInfoFindBulkParticipantQuery extends BulkParticipantQuery {

  public ClearingHouseInfoFindBulkParticipantQuery (BSDMSessionContext context, ClearingHouseInfoObjectFilter inFilter) {
    queryName = "ClearingHouseInfoFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ClearingHouseInfoFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ClearingHouseInfoObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ClearingHouseInfoObjectHelper.toMap((ClearingHouseInfoObjectFilter)filter, new HashMap(), "ClearingHouseInfo");
    }
  }
  public static ClearingHouseInfoFindBulkParticipantQuery fromQueryMap(Map input) {
    ClearingHouseInfoFindBulkParticipantQuery retVal = new ClearingHouseInfoFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ClearingHouseInfoFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ClearingHouseInfo");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ClearingHouseInfoObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

