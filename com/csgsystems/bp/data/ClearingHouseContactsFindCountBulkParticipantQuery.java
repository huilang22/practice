package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ClearingHouseContactsFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public ClearingHouseContactsFindCountBulkParticipantQuery (BSDMSessionContext context, ClearingHouseContactsObjectFilter inFilter) {
    queryName = "ClearingHouseContactsFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public ClearingHouseContactsFindCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ClearingHouseContactsObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ClearingHouseContactsObjectHelper.toMap((ClearingHouseContactsObjectFilter)filter, new HashMap(), "ClearingHouseContacts");
    }
  }
  public static ClearingHouseContactsFindCountBulkParticipantQuery fromQueryMap(Map input) {
    ClearingHouseContactsFindCountBulkParticipantQuery retVal = new ClearingHouseContactsFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ClearingHouseContactsFindCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ClearingHouseContacts");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ClearingHouseContactsObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

