package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExtendedDataParamFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExtendedDataParamFindBulkParticipantQuery (BSDMSessionContext context, XPDObjectFilter inFilter) {
    queryName = "ExtendedDataParamFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExtendedDataParamFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(XPDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return XPDObjectHelper.toMap((XPDObjectFilter)filter, new HashMap(), "ExtendedDataParam");
    }
  }
  public static ExtendedDataParamFindBulkParticipantQuery fromQueryMap(Map input) {
    ExtendedDataParamFindBulkParticipantQuery retVal = new ExtendedDataParamFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExtendedDataParamFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExtendedDataParam");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(XPDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

