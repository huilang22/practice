package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class NoteCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public NoteCodeFindBulkParticipantQuery (BSDMSessionContext context, NoteCodeObjectFilter inFilter) {
    queryName = "NoteCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public NoteCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(NoteCodeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return NoteCodeObjectHelper.toMap((NoteCodeObjectFilter)filter, new HashMap(), "NoteCode");
    }
  }
  public static NoteCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    NoteCodeFindBulkParticipantQuery retVal = new NoteCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("NoteCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("NoteCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(NoteCodeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

