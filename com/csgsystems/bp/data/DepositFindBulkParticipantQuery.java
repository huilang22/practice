package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class DepositFindBulkParticipantQuery extends BulkParticipantQuery {

  public DepositFindBulkParticipantQuery (BSDMSessionContext context, DepositObjectFilter inFilter) {
    queryName = "DepositFind";
    filter = inFilter;
    this.setContext(context);
  }
  public DepositFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(DepositObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return DepositObjectHelper.toMap((DepositObjectFilter)filter, new HashMap(), "Deposit");
    }
  }
  public static DepositFindBulkParticipantQuery fromQueryMap(Map input) {
    DepositFindBulkParticipantQuery retVal = new DepositFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("DepositFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Deposit");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(DepositObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

