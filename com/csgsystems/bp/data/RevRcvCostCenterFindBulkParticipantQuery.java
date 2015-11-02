package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class RevRcvCostCenterFindBulkParticipantQuery extends BulkParticipantQuery {

  public RevRcvCostCenterFindBulkParticipantQuery (BSDMSessionContext context, RevRcvCostCenterObjectFilter inFilter) {
    queryName = "RevRcvCostCenterFind";
    filter = inFilter;
    this.setContext(context);
  }
  public RevRcvCostCenterFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RevRcvCostCenterObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RevRcvCostCenterObjectHelper.toMap((RevRcvCostCenterObjectFilter)filter, new HashMap(), "RevRcvCostCenter");
    }
  }
  public static RevRcvCostCenterFindBulkParticipantQuery fromQueryMap(Map input) {
    RevRcvCostCenterFindBulkParticipantQuery retVal = new RevRcvCostCenterFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("RevRcvCostCenterFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("RevRcvCostCenter");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RevRcvCostCenterObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

