package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServerFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServerFindBulkParticipantQuery (BSDMSessionContext context, ServerObjectFilter inFilter) {
    queryName = "ServerFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServerFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServerObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServerObjectHelper.toMap((ServerObjectFilter)filter, new HashMap(), "Server");
    }
  }
  public static ServerFindBulkParticipantQuery fromQueryMap(Map input) {
    ServerFindBulkParticipantQuery retVal = new ServerFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServerFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Server");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServerObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

