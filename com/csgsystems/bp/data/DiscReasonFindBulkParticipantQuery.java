package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class DiscReasonFindBulkParticipantQuery extends BulkParticipantQuery {

  public DiscReasonFindBulkParticipantQuery (BSDMSessionContext context, DiscReasonObjectFilter inFilter) {
    queryName = "DiscReasonFind";
    filter = inFilter;
    this.setContext(context);
  }
  public DiscReasonFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(DiscReasonObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return DiscReasonObjectHelper.toMap((DiscReasonObjectFilter)filter, new HashMap(), "DiscReason");
    }
  }
  public static DiscReasonFindBulkParticipantQuery fromQueryMap(Map input) {
    DiscReasonFindBulkParticipantQuery retVal = new DiscReasonFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("DiscReasonFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("DiscReason");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(DiscReasonObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

