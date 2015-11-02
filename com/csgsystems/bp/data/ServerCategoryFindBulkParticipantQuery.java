package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServerCategoryFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServerCategoryFindBulkParticipantQuery (BSDMSessionContext context, SCObjectFilter inFilter) {
    queryName = "ServerCategoryFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServerCategoryFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SCObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SCObjectHelper.toMap((SCObjectFilter)filter, new HashMap(), "ServerCategory");
    }
  }
  public static ServerCategoryFindBulkParticipantQuery fromQueryMap(Map input) {
    ServerCategoryFindBulkParticipantQuery retVal = new ServerCategoryFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServerCategoryFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServerCategory");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SCObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

