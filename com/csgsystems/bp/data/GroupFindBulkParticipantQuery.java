package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GroupFindBulkParticipantQuery extends BulkParticipantQuery {

  public GroupFindBulkParticipantQuery (BSDMSessionContext context, GroupObjectFilter inFilter) {
    queryName = "GroupFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GroupFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GroupObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GroupObjectHelper.toMap((GroupObjectFilter)filter, new HashMap(), "Group");
    }
  }
  public static GroupFindBulkParticipantQuery fromQueryMap(Map input) {
    GroupFindBulkParticipantQuery retVal = new GroupFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GroupFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Group");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GroupObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

