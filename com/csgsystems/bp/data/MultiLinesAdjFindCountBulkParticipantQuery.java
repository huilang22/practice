package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class MultiLinesAdjFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public MultiLinesAdjFindCountBulkParticipantQuery (BSDMSessionContext context, MultiLinesAdjObjectFilter inFilter) {
    queryName = "MultiLinesAdjFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public MultiLinesAdjFindCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(MultiLinesAdjObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return MultiLinesAdjObjectHelper.toMap((MultiLinesAdjObjectFilter)filter, new HashMap(), "MultiLinesAdj");
    }
  }
  public static MultiLinesAdjFindCountBulkParticipantQuery fromQueryMap(Map input) {
    MultiLinesAdjFindCountBulkParticipantQuery retVal = new MultiLinesAdjFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("MultiLinesAdjFindCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("MultiLinesAdj");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(MultiLinesAdjObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

