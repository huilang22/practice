package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExtendedDataLocateFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExtendedDataLocateFindBulkParticipantQuery (BSDMSessionContext context, ExtendedDataLocateObjectFilter inFilter) {
    queryName = "ExtendedDataLocateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExtendedDataLocateFindBulkParticipantQuery () {
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
  public static ExtendedDataLocateFindBulkParticipantQuery fromQueryMap(Map input) {
    ExtendedDataLocateFindBulkParticipantQuery retVal = new ExtendedDataLocateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExtendedDataLocateFind");
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

