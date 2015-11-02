package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class StatusReasonMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public StatusReasonMapFindBulkParticipantQuery (BSDMSessionContext context, SRMObjectFilter inFilter) {
    queryName = "StatusReasonMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public StatusReasonMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SRMObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SRMObjectHelper.toMap((SRMObjectFilter)filter, new HashMap(), "StatusReasonMap");
    }
  }
  public static StatusReasonMapFindBulkParticipantQuery fromQueryMap(Map input) {
    StatusReasonMapFindBulkParticipantQuery retVal = new StatusReasonMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("StatusReasonMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("StatusReasonMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SRMObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

