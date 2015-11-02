package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RefundReasonFindBulkParticipantQuery extends BulkParticipantQuery {

  public RefundReasonFindBulkParticipantQuery (BSDMSessionContext context, RefundReasonObjectFilter inFilter) {
    queryName = "RefundReasonFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RefundReasonFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RefundReasonObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RefundReasonObjectHelper.toMap((RefundReasonObjectFilter)filter, new HashMap(), "RefundReason");
    }
  }
  public static RefundReasonFindBulkParticipantQuery fromQueryMap(Map input) {
    RefundReasonFindBulkParticipantQuery retVal = new RefundReasonFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RefundReasonFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RefundReason");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RefundReasonObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

