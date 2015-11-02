package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ClearingHouseFindBulkParticipantQuery extends BulkParticipantQuery {

  public ClearingHouseFindBulkParticipantQuery (BSDMSessionContext context, ClearingHouseObjectFilter inFilter) {
    queryName = "ClearingHouseFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ClearingHouseFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ClearingHouseObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ClearingHouseObjectHelper.toMap((ClearingHouseObjectFilter)filter, new HashMap(), "ClearingHouse");
    }
  }
  public static ClearingHouseFindBulkParticipantQuery fromQueryMap(Map input) {
    ClearingHouseFindBulkParticipantQuery retVal = new ClearingHouseFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ClearingHouseFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ClearingHouse");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ClearingHouseObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

