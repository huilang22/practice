package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillCycleFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillCycleFindBulkParticipantQuery (BSDMSessionContext context, BillCycleObjectFilter inFilter) {
    queryName = "BillCycleFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillCycleFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillCycleObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillCycleObjectHelper.toMap((BillCycleObjectFilter)filter, new HashMap(), "BillCycle");
    }
  }
  public static BillCycleFindBulkParticipantQuery fromQueryMap(Map input) {
    BillCycleFindBulkParticipantQuery retVal = new BillCycleFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillCycleFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillCycle");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillCycleObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

