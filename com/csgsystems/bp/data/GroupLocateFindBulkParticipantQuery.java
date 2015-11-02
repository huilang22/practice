package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GroupLocateFindBulkParticipantQuery extends BulkParticipantQuery {

  public GroupLocateFindBulkParticipantQuery (BSDMSessionContext context, GroupLocateObjectFilter inFilter) {
    queryName = "GroupLocateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GroupLocateFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GroupLocateObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GroupLocateObjectHelper.toMap((GroupLocateObjectFilter)filter, new HashMap(), "GroupLocate");
    }
  }
  public static GroupLocateFindBulkParticipantQuery fromQueryMap(Map input) {
    GroupLocateFindBulkParticipantQuery retVal = new GroupLocateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GroupLocateFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GroupLocate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GroupLocateObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

