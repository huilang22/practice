package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxAssignmentFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxAssignmentFindBulkParticipantQuery (BSDMSessionContext context, TaxAssignmentObjectFilter inFilter) {
    queryName = "TaxAssignmentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxAssignmentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TaxAssignmentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TaxAssignmentObjectHelper.toMap((TaxAssignmentObjectFilter)filter, new HashMap(), "TaxAssignment");
    }
  }
  public static TaxAssignmentFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxAssignmentFindBulkParticipantQuery retVal = new TaxAssignmentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxAssignmentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxAssignment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TaxAssignmentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

