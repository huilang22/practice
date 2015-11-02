package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillInsertGroupMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillInsertGroupMapFindBulkParticipantQuery (BSDMSessionContext context, BillInsertGroupMapObjectFilter inFilter) {
    queryName = "BillInsertGroupMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillInsertGroupMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillInsertGroupMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillInsertGroupMapObjectHelper.toMap((BillInsertGroupMapObjectFilter)filter, new HashMap(), "BillInsertGroupMap");
    }
  }
  public static BillInsertGroupMapFindBulkParticipantQuery fromQueryMap(Map input) {
    BillInsertGroupMapFindBulkParticipantQuery retVal = new BillInsertGroupMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillInsertGroupMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillInsertGroupMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillInsertGroupMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

