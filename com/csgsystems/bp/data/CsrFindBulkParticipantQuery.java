package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CsrFindBulkParticipantQuery extends BulkParticipantQuery {

  public CsrFindBulkParticipantQuery (BSDMSessionContext context, CsrObjectFilter inFilter) {
    queryName = "CsrFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CsrFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CsrObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CsrObjectHelper.toMap((CsrObjectFilter)filter, new HashMap(), "Csr");
    }
  }
  public static CsrFindBulkParticipantQuery fromQueryMap(Map input) {
    CsrFindBulkParticipantQuery retVal = new CsrFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CsrFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Csr");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CsrObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

