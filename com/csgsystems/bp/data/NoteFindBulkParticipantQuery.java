package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class NoteFindBulkParticipantQuery extends BulkParticipantQuery {

  public NoteFindBulkParticipantQuery (BSDMSessionContext context, NoteObjectFilter inFilter) {
    queryName = "NoteFind";
    filter = inFilter;
    this.setContext(context);
  }
  public NoteFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(NoteObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return NoteObjectHelper.toMap((NoteObjectFilter)filter, new HashMap(), "Note");
    }
  }
  public static NoteFindBulkParticipantQuery fromQueryMap(Map input) {
    NoteFindBulkParticipantQuery retVal = new NoteFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("NoteFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Note");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(NoteObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

