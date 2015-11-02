package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BalanceLineItemFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public BalanceLineItemFindCountBulkParticipantQuery (BSDMSessionContext context, BalanceLineItemObjectFilter inFilter) {
    queryName = "BalanceLineItemFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public BalanceLineItemFindCountBulkParticipantQuery () {
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
  public static BalanceLineItemFindCountBulkParticipantQuery fromQueryMap(Map input) {
    BalanceLineItemFindCountBulkParticipantQuery retVal = new BalanceLineItemFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BalanceLineItemFindCount");
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

