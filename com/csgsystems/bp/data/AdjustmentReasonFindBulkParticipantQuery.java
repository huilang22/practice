package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AdjustmentReasonFindBulkParticipantQuery extends BulkParticipantQuery {

  public AdjustmentReasonFindBulkParticipantQuery (BSDMSessionContext context, AdjustmentReasonObjectFilter inFilter) {
    queryName = "AdjustmentReasonFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AdjustmentReasonFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AdjustmentReasonObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AdjustmentReasonObjectHelper.toMap((AdjustmentReasonObjectFilter)filter, new HashMap(), "AdjustmentReason");
    }
  }
  public static AdjustmentReasonFindBulkParticipantQuery fromQueryMap(Map input) {
    AdjustmentReasonFindBulkParticipantQuery retVal = new AdjustmentReasonFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AdjustmentReasonFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AdjustmentReason");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AdjustmentReasonObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

