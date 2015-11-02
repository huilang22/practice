package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqGroupsFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqGroupsFindBulkParticipantQuery (BSDMSessionContext context, HqGroupsObjectFilter inFilter) {
    queryName = "HqGroupsFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqGroupsFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqGroupsObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqGroupsObjectHelper.toMap((HqGroupsObjectFilter)filter, new HashMap(), "HqGroups");
    }
  }
  public static HqGroupsFindBulkParticipantQuery fromQueryMap(Map input) {
    HqGroupsFindBulkParticipantQuery retVal = new HqGroupsFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqGroupsFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqGroups");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqGroupsObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

