package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExtendedDataLocateDeleteListBulkParticipantQuery extends BulkParticipantQuery {

  public ExtendedDataLocateDeleteListBulkParticipantQuery (BSDMSessionContext context, ExtendedDataLocateObjectFilter inFilter) {
    queryName = "ExtendedDataLocateDeleteList";
    filter = inFilter;
    this.setContext(context);
  }
  public ExtendedDataLocateDeleteListBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ExtendedDataLocateObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ExtendedDataLocateObjectHelper.toMap((ExtendedDataLocateObjectFilter)filter, new HashMap(), "ExtendedDataLocate");
    }
  }
  public static ExtendedDataLocateDeleteListBulkParticipantQuery fromQueryMap(Map input) {
    ExtendedDataLocateDeleteListBulkParticipantQuery retVal = new ExtendedDataLocateDeleteListBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExtendedDataLocateDeleteList");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExtendedDataLocate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ExtendedDataLocateObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

