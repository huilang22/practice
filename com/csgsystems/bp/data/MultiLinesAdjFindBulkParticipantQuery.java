package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class MultiLinesAdjFindBulkParticipantQuery extends BulkParticipantQuery {

  public MultiLinesAdjFindBulkParticipantQuery (BSDMSessionContext context, MultiLinesAdjObjectFilter inFilter) {
    queryName = "MultiLinesAdjFind";
    filter = inFilter;
    this.setContext(context);
  }
  public MultiLinesAdjFindBulkParticipantQuery () {
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
  public static MultiLinesAdjFindBulkParticipantQuery fromQueryMap(Map input) {
    MultiLinesAdjFindBulkParticipantQuery retVal = new MultiLinesAdjFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("MultiLinesAdjFind");
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

