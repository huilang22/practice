package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqgroupUsageRedirectMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqgroupUsageRedirectMapFindBulkParticipantQuery (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter inFilter) {
    queryName = "HqgroupUsageRedirectMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqgroupUsageRedirectMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqGroupUsageRedirectMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqGroupUsageRedirectMapObjectHelper.toMap((HqGroupUsageRedirectMapObjectFilter)filter, new HashMap(), "HqgroupUsageRedirectMap");
    }
  }
  public static HqgroupUsageRedirectMapFindBulkParticipantQuery fromQueryMap(Map input) {
    HqgroupUsageRedirectMapFindBulkParticipantQuery retVal = new HqgroupUsageRedirectMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqgroupUsageRedirectMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqgroupUsageRedirectMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqGroupUsageRedirectMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

