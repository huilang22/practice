package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class NoteTextFindBulkParticipantQuery extends BulkParticipantQuery {

  public NoteTextFindBulkParticipantQuery (BSDMSessionContext context, NoteTextObjectFilter inFilter) {
    queryName = "NoteTextFind";
    filter = inFilter;
    this.setContext(context);
  }
  public NoteTextFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(NoteTextObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return NoteTextObjectHelper.toMap((NoteTextObjectFilter)filter, new HashMap(), "NoteText");
    }
  }
  public static NoteTextFindBulkParticipantQuery fromQueryMap(Map input) {
    NoteTextFindBulkParticipantQuery retVal = new NoteTextFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("NoteTextFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("NoteText");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(NoteTextObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

