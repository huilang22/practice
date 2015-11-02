package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServerDefinitionFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServerDefinitionFindBulkParticipantQuery (BSDMSessionContext context, ServerDefinitionObjectFilter inFilter) {
    queryName = "ServerDefinitionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServerDefinitionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServerDefinitionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServerDefinitionObjectHelper.toMap((ServerDefinitionObjectFilter)filter, new HashMap(), "ServerDefinition");
    }
  }
  public static ServerDefinitionFindBulkParticipantQuery fromQueryMap(Map input) {
    ServerDefinitionFindBulkParticipantQuery retVal = new ServerDefinitionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServerDefinitionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServerDefinition");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServerDefinitionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

