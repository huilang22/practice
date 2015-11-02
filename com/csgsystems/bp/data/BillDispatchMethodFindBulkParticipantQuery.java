package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillDispatchMethodFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillDispatchMethodFindBulkParticipantQuery (BSDMSessionContext context, BillDispatchMethodObjectFilter inFilter) {
    queryName = "BillDispatchMethodFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillDispatchMethodFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillDispatchMethodObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillDispatchMethodObjectHelper.toMap((BillDispatchMethodObjectFilter)filter, new HashMap(), "BillDispatchMethod");
    }
  }
  public static BillDispatchMethodFindBulkParticipantQuery fromQueryMap(Map input) {
    BillDispatchMethodFindBulkParticipantQuery retVal = new BillDispatchMethodFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillDispatchMethodFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillDispatchMethod");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillDispatchMethodObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

