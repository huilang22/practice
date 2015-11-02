package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TransferReasonFindBulkParticipantQuery extends BulkParticipantQuery {

  public TransferReasonFindBulkParticipantQuery (BSDMSessionContext context, TransferReasonObjectFilter inFilter) {
    queryName = "TransferReasonFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TransferReasonFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TransferReasonObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TransferReasonObjectHelper.toMap((TransferReasonObjectFilter)filter, new HashMap(), "TransferReason");
    }
  }
  public static TransferReasonFindBulkParticipantQuery fromQueryMap(Map input) {
    TransferReasonFindBulkParticipantQuery retVal = new TransferReasonFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TransferReasonFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TransferReason");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TransferReasonObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

