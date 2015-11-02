package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqGroupMembersFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqGroupMembersFindBulkParticipantQuery (BSDMSessionContext context, HqGroupMembersObjectFilter inFilter) {
    queryName = "HqGroupMembersFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqGroupMembersFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqGroupMembersObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqGroupMembersObjectHelper.toMap((HqGroupMembersObjectFilter)filter, new HashMap(), "HqGroupMembers");
    }
  }
  public static HqGroupMembersFindBulkParticipantQuery fromQueryMap(Map input) {
    HqGroupMembersFindBulkParticipantQuery retVal = new HqGroupMembersFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqGroupMembersFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqGroupMembers");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqGroupMembersObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

