package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BalanceLineItemFindBulkParticipantQuery extends BulkParticipantQuery {

  public BalanceLineItemFindBulkParticipantQuery (BSDMSessionContext context, BalanceLineItemObjectFilter inFilter) {
    queryName = "BalanceLineItemFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BalanceLineItemFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BalanceLineItemObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BalanceLineItemObjectHelper.toMap((BalanceLineItemObjectFilter)filter, new HashMap(), "BalanceLineItem");
    }
  }
  public static BalanceLineItemFindBulkParticipantQuery fromQueryMap(Map input) {
    BalanceLineItemFindBulkParticipantQuery retVal = new BalanceLineItemFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BalanceLineItemFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BalanceLineItem");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BalanceLineItemObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

