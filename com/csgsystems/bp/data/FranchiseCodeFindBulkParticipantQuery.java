package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class FranchiseCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public FranchiseCodeFindBulkParticipantQuery (BSDMSessionContext context, FranchiseCodeObjectFilter inFilter) {
    queryName = "FranchiseCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public FranchiseCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(FranchiseCodeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return FranchiseCodeObjectHelper.toMap((FranchiseCodeObjectFilter)filter, new HashMap(), "FranchiseCode");
    }
  }
  public static FranchiseCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    FranchiseCodeFindBulkParticipantQuery retVal = new FranchiseCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("FranchiseCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("FranchiseCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(FranchiseCodeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

