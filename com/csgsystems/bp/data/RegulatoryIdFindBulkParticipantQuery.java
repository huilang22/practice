package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RegulatoryIdFindBulkParticipantQuery extends BulkParticipantQuery {

  public RegulatoryIdFindBulkParticipantQuery (BSDMSessionContext context, RegulatoryIdObjectFilter inFilter) {
    queryName = "RegulatoryIdFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RegulatoryIdFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RegulatoryIdObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RegulatoryIdObjectHelper.toMap((RegulatoryIdObjectFilter)filter, new HashMap(), "RegulatoryId");
    }
  }
  public static RegulatoryIdFindBulkParticipantQuery fromQueryMap(Map input) {
    RegulatoryIdFindBulkParticipantQuery retVal = new RegulatoryIdFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RegulatoryIdFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RegulatoryId");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RegulatoryIdObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

