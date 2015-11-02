package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ConnectReasonFindBulkParticipantQuery extends BulkParticipantQuery {

  public ConnectReasonFindBulkParticipantQuery (BSDMSessionContext context, ConnectReasonObjectFilter inFilter) {
    queryName = "ConnectReasonFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ConnectReasonFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ConnectReasonObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ConnectReasonObjectHelper.toMap((ConnectReasonObjectFilter)filter, new HashMap(), "ConnectReason");
    }
  }
  public static ConnectReasonFindBulkParticipantQuery fromQueryMap(Map input) {
    ConnectReasonFindBulkParticipantQuery retVal = new ConnectReasonFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ConnectReasonFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ConnectReason");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ConnectReasonObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

