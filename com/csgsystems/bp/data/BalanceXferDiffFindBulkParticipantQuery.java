package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BalanceXferDiffFindBulkParticipantQuery extends BulkParticipantQuery {

  public BalanceXferDiffFindBulkParticipantQuery (BSDMSessionContext context, BXDObjectFilter inFilter) {
    queryName = "BalanceXferDiffFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BalanceXferDiffFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BXDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BXDObjectHelper.toMap((BXDObjectFilter)filter, new HashMap(), "BalanceXferDiff");
    }
  }
  public static BalanceXferDiffFindBulkParticipantQuery fromQueryMap(Map input) {
    BalanceXferDiffFindBulkParticipantQuery retVal = new BalanceXferDiffFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BalanceXferDiffFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BalanceXferDiff");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BXDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

