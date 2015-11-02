package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class InterimBillFindBulkParticipantQuery extends BulkParticipantQuery {

  public InterimBillFindBulkParticipantQuery (BSDMSessionContext context, InterimBillObjectFilter inFilter) {
    queryName = "InterimBillFind";
    filter = inFilter;
    this.setContext(context);
  }
  public InterimBillFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(InterimBillObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return InterimBillObjectHelper.toMap((InterimBillObjectFilter)filter, new HashMap(), "InterimBill");
    }
  }
  public static InterimBillFindBulkParticipantQuery fromQueryMap(Map input) {
    InterimBillFindBulkParticipantQuery retVal = new InterimBillFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("InterimBillFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("InterimBill");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(InterimBillObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

