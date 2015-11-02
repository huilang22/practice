package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class EnhancedNoteFindBulkParticipantQuery extends BulkParticipantQuery {

  public EnhancedNoteFindBulkParticipantQuery (BSDMSessionContext context, EnhancedNoteObjectFilter inFilter) {
    queryName = "EnhancedNoteFind";
    filter = inFilter;
    this.setContext(context);
  }
  public EnhancedNoteFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(EnhancedNoteObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return EnhancedNoteObjectHelper.toMap((EnhancedNoteObjectFilter)filter, new HashMap(), "EnhancedNote");
    }
  }
  public static EnhancedNoteFindBulkParticipantQuery fromQueryMap(Map input) {
    EnhancedNoteFindBulkParticipantQuery retVal = new EnhancedNoteFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("EnhancedNoteFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("EnhancedNote");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(EnhancedNoteObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

