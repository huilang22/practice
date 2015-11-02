package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CdrDataDucFindBulkParticipantQuery extends BulkParticipantQuery {

  public CdrDataDucFindBulkParticipantQuery (BSDMSessionContext context, CdrDataDucObjectFilter inFilter) {
    queryName = "CdrDataDucFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CdrDataDucFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CdrDataDucObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CdrDataDucObjectHelper.toMap((CdrDataDucObjectFilter)filter, new HashMap(), "CdrDataDuc");
    }
  }
  public static CdrDataDucFindBulkParticipantQuery fromQueryMap(Map input) {
    CdrDataDucFindBulkParticipantQuery retVal = new CdrDataDucFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CdrDataDucFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CdrDataDuc");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CdrDataDucObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

