package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RefundFindBulkParticipantQuery extends BulkParticipantQuery {

  public RefundFindBulkParticipantQuery (BSDMSessionContext context, RefundObjectFilter inFilter) {
    queryName = "RefundFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RefundFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RefundObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RefundObjectHelper.toMap((RefundObjectFilter)filter, new HashMap(), "Refund");
    }
  }
  public static RefundFindBulkParticipantQuery fromQueryMap(Map input) {
    RefundFindBulkParticipantQuery retVal = new RefundFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RefundFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Refund");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RefundObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

