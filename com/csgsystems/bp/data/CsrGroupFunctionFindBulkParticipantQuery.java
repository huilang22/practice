package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CsrGroupFunctionFindBulkParticipantQuery extends BulkParticipantQuery {

  public CsrGroupFunctionFindBulkParticipantQuery (BSDMSessionContext context, CsrGroupFunctionObjectFilter inFilter) {
    queryName = "CsrGroupFunctionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CsrGroupFunctionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CsrGroupFunctionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CsrGroupFunctionObjectHelper.toMap((CsrGroupFunctionObjectFilter)filter, new HashMap(), "CsrGroupFunction");
    }
  }
  public static CsrGroupFunctionFindBulkParticipantQuery fromQueryMap(Map input) {
    CsrGroupFunctionFindBulkParticipantQuery retVal = new CsrGroupFunctionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CsrGroupFunctionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CsrGroupFunction");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CsrGroupFunctionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

