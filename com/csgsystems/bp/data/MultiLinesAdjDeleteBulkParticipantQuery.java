package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class MultiLinesAdjDeleteBulkParticipantQuery extends BulkParticipantQuery {

  public MultiLinesAdjDeleteBulkParticipantQuery (BSDMSessionContext context, MultiLinesAdjKeyObjectFilter inFilter) {
    queryName = "MultiLinesAdjDelete";
    filter = inFilter;
    this.setContext(context);
  }
  public MultiLinesAdjDeleteBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(MultiLinesAdjKeyObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return MultiLinesAdjKeyObjectHelper.toMap((MultiLinesAdjKeyObjectFilter)filter, new HashMap(), "MultiLinesAdj");
    }
  }
  public static MultiLinesAdjDeleteBulkParticipantQuery fromQueryMap(Map input) {
    MultiLinesAdjDeleteBulkParticipantQuery retVal = new MultiLinesAdjDeleteBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("MultiLinesAdjDelete");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("MultiLinesAdj");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(MultiLinesAdjKeyObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

