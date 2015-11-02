package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExternalIdHqgroupsMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExternalIdHqgroupsMapFindBulkParticipantQuery (BSDMSessionContext context, EIHGMObjectFilter inFilter) {
    queryName = "ExternalIdHqgroupsMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExternalIdHqgroupsMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(EIHGMObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return EIHGMObjectHelper.toMap((EIHGMObjectFilter)filter, new HashMap(), "ExternalIdHqGroupsMap");
    }
  }
  public static ExternalIdHqgroupsMapFindBulkParticipantQuery fromQueryMap(Map input) {
    ExternalIdHqgroupsMapFindBulkParticipantQuery retVal = new ExternalIdHqgroupsMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExternalIdHqgroupsMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExternalIdHqGroupsMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(EIHGMObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

