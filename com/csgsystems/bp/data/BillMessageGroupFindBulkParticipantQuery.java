package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillMessageGroupFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillMessageGroupFindBulkParticipantQuery (BSDMSessionContext context, BillMessageGroupObjectFilter inFilter) {
    queryName = "BillMessageGroupFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillMessageGroupFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillMessageGroupObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillMessageGroupObjectHelper.toMap((BillMessageGroupObjectFilter)filter, new HashMap(), "BillMessageGroup");
    }
  }
  public static BillMessageGroupFindBulkParticipantQuery fromQueryMap(Map input) {
    BillMessageGroupFindBulkParticipantQuery retVal = new BillMessageGroupFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillMessageGroupFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillMessageGroup");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillMessageGroupObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

