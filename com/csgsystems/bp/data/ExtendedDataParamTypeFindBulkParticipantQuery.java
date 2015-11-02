package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExtendedDataParamTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExtendedDataParamTypeFindBulkParticipantQuery (BSDMSessionContext context, XPTObjectFilter inFilter) {
    queryName = "ExtendedDataParamTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExtendedDataParamTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(XPTObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return XPTObjectHelper.toMap((XPTObjectFilter)filter, new HashMap(), "ExtendedDataParamType");
    }
  }
  public static ExtendedDataParamTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    ExtendedDataParamTypeFindBulkParticipantQuery retVal = new ExtendedDataParamTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExtendedDataParamTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExtendedDataParamType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(XPTObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

