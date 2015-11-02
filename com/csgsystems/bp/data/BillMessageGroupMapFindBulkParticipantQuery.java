package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillMessageGroupMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillMessageGroupMapFindBulkParticipantQuery (BSDMSessionContext context, BillMessageGroupMapObjectFilter inFilter) {
    queryName = "BillMessageGroupMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillMessageGroupMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillMessageGroupMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillMessageGroupMapObjectHelper.toMap((BillMessageGroupMapObjectFilter)filter, new HashMap(), "BillMessageGroupMap");
    }
  }
  public static BillMessageGroupMapFindBulkParticipantQuery fromQueryMap(Map input) {
    BillMessageGroupMapFindBulkParticipantQuery retVal = new BillMessageGroupMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillMessageGroupMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillMessageGroupMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillMessageGroupMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

