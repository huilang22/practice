package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RtPaymentResponseFindBulkParticipantQuery extends BulkParticipantQuery {

  public RtPaymentResponseFindBulkParticipantQuery (BSDMSessionContext context, RtPaymentResponseObjectFilter inFilter) {
    queryName = "RtPaymentResponseFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RtPaymentResponseFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RtPaymentResponseObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RtPaymentResponseObjectHelper.toMap((RtPaymentResponseObjectFilter)filter, new HashMap(), "RtPaymentResponse");
    }
  }
  public static RtPaymentResponseFindBulkParticipantQuery fromQueryMap(Map input) {
    RtPaymentResponseFindBulkParticipantQuery retVal = new RtPaymentResponseFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RtPaymentResponseFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RtPaymentResponse");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RtPaymentResponseObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

