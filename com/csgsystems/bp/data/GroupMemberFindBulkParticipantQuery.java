package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GroupMemberFindBulkParticipantQuery extends BulkParticipantQuery {

  public GroupMemberFindBulkParticipantQuery (BSDMSessionContext context, GroupMemberObjectFilter inFilter) {
    queryName = "GroupMemberFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GroupMemberFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GroupMemberObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GroupMemberObjectHelper.toMap((GroupMemberObjectFilter)filter, new HashMap(), "GroupMember");
    }
  }
  public static GroupMemberFindBulkParticipantQuery fromQueryMap(Map input) {
    GroupMemberFindBulkParticipantQuery retVal = new GroupMemberFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GroupMemberFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GroupMember");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GroupMemberObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

