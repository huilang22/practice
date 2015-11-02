package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxStatusFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxStatusFindBulkParticipantQuery (BSDMSessionContext context, TSObjectFilter inFilter) {
    queryName = "TaxStatusFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxStatusFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TSObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TSObjectHelper.toMap((TSObjectFilter)filter, new HashMap(), "TaxStatus");
    }
  }
  public static TaxStatusFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxStatusFindBulkParticipantQuery retVal = new TaxStatusFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxStatusFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxStatus");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TSObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

