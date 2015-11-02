package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class OwningCostCenterFindBulkParticipantQuery extends BulkParticipantQuery {

  public OwningCostCenterFindBulkParticipantQuery (BSDMSessionContext context, OwningCostCenterObjectFilter inFilter) {
    queryName = "OwningCostCenterFind";
    filter = inFilter;
    this.setContext(context);
  }
  public OwningCostCenterFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(OwningCostCenterObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return OwningCostCenterObjectHelper.toMap((OwningCostCenterObjectFilter)filter, new HashMap(), "OwningCostCenter");
    }
  }
  public static OwningCostCenterFindBulkParticipantQuery fromQueryMap(Map input) {
    OwningCostCenterFindBulkParticipantQuery retVal = new OwningCostCenterFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("OwningCostCenterFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("OwningCostCenter");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(OwningCostCenterObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

