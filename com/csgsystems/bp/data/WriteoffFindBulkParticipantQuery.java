package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class WriteoffFindBulkParticipantQuery extends BulkParticipantQuery {

  public WriteoffFindBulkParticipantQuery (BSDMSessionContext context, WriteoffObjectFilter inFilter) {
    queryName = "WriteoffFind";
    filter = inFilter;
    this.setContext(context);
  }
  public WriteoffFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(WriteoffObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return WriteoffObjectHelper.toMap((WriteoffObjectFilter)filter, new HashMap(), "Writeoff");
    }
  }
  public static WriteoffFindBulkParticipantQuery fromQueryMap(Map input) {
    WriteoffFindBulkParticipantQuery retVal = new WriteoffFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("WriteoffFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Writeoff");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(WriteoffObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

