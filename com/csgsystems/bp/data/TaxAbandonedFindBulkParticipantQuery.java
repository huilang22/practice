package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxAbandonedFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxAbandonedFindBulkParticipantQuery (BSDMSessionContext context, TaxAbandonedObjectFilter inFilter) {
    queryName = "TaxAbandonedFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxAbandonedFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TaxAbandonedObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TaxAbandonedObjectHelper.toMap((TaxAbandonedObjectFilter)filter, new HashMap(), "TaxAbandoned");
    }
  }
  public static TaxAbandonedFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxAbandonedFindBulkParticipantQuery retVal = new TaxAbandonedFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxAbandonedFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxAbandoned");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TaxAbandonedObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

