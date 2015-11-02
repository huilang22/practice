package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillInsertGroupFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillInsertGroupFindBulkParticipantQuery (BSDMSessionContext context, BillInsertGroupObjectFilter inFilter) {
    queryName = "BillInsertGroupFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillInsertGroupFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillInsertGroupObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillInsertGroupObjectHelper.toMap((BillInsertGroupObjectFilter)filter, new HashMap(), "BillInsertGroup");
    }
  }
  public static BillInsertGroupFindBulkParticipantQuery fromQueryMap(Map input) {
    BillInsertGroupFindBulkParticipantQuery retVal = new BillInsertGroupFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillInsertGroupFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillInsertGroup");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillInsertGroupObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

