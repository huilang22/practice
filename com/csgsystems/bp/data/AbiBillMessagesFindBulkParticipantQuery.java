package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AbiBillMessagesFindBulkParticipantQuery extends BulkParticipantQuery {

  public AbiBillMessagesFindBulkParticipantQuery (BSDMSessionContext context, AbiBillMessagesObjectFilter inFilter) {
    queryName = "AbiBillMessagesFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AbiBillMessagesFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AbiBillMessagesObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AbiBillMessagesObjectHelper.toMap((AbiBillMessagesObjectFilter)filter, new HashMap(), "AbiBillMessages");
    }
  }
  public static AbiBillMessagesFindBulkParticipantQuery fromQueryMap(Map input) {
    AbiBillMessagesFindBulkParticipantQuery retVal = new AbiBillMessagesFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AbiBillMessagesFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AbiBillMessages");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AbiBillMessagesObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

