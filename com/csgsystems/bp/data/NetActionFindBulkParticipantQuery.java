package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class NetActionFindBulkParticipantQuery extends BulkParticipantQuery {

  public NetActionFindBulkParticipantQuery (BSDMSessionContext context, NetActionObjectFilter inFilter) {
    queryName = "NetActionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public NetActionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(NetActionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return NetActionObjectHelper.toMap((NetActionObjectFilter)filter, new HashMap(), "NetAction");
    }
  }
  public static NetActionFindBulkParticipantQuery fromQueryMap(Map input) {
    NetActionFindBulkParticipantQuery retVal = new NetActionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("NetActionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("NetAction");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(NetActionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

