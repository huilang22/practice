package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CsrGroupAmountFindBulkParticipantQuery extends BulkParticipantQuery {

  public CsrGroupAmountFindBulkParticipantQuery (BSDMSessionContext context, CsrGroupAmountObjectFilter inFilter) {
    queryName = "CsrGroupAmountFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CsrGroupAmountFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CsrGroupAmountObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CsrGroupAmountObjectHelper.toMap((CsrGroupAmountObjectFilter)filter, new HashMap(), "CsrGroupAmount");
    }
  }
  public static CsrGroupAmountFindBulkParticipantQuery fromQueryMap(Map input) {
    CsrGroupAmountFindBulkParticipantQuery retVal = new CsrGroupAmountFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CsrGroupAmountFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CsrGroupAmount");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CsrGroupAmountObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

