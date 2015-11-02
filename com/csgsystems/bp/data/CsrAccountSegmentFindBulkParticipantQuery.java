package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CsrAccountSegmentFindBulkParticipantQuery extends BulkParticipantQuery {

  public CsrAccountSegmentFindBulkParticipantQuery (BSDMSessionContext context, CsrAccountSegmentObjectFilter inFilter) {
    queryName = "CsrAccountSegmentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CsrAccountSegmentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CsrAccountSegmentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CsrAccountSegmentObjectHelper.toMap((CsrAccountSegmentObjectFilter)filter, new HashMap(), "CsrAccountSegment");
    }
  }
  public static CsrAccountSegmentFindBulkParticipantQuery fromQueryMap(Map input) {
    CsrAccountSegmentFindBulkParticipantQuery retVal = new CsrAccountSegmentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CsrAccountSegmentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CsrAccountSegment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CsrAccountSegmentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

