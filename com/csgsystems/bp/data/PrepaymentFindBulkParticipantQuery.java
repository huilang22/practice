package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PrepaymentFindBulkParticipantQuery extends BulkParticipantQuery {

  public PrepaymentFindBulkParticipantQuery (BSDMSessionContext context, PrepaymentObjectFilter inFilter) {
    queryName = "PrepaymentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PrepaymentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PrepaymentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PrepaymentObjectHelper.toMap((PrepaymentObjectFilter)filter, new HashMap(), "Prepayment");
    }
  }
  public static PrepaymentFindBulkParticipantQuery fromQueryMap(Map input) {
    PrepaymentFindBulkParticipantQuery retVal = new PrepaymentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PrepaymentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Prepayment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PrepaymentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

