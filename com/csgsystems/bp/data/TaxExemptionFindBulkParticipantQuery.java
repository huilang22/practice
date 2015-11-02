package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxExemptionFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxExemptionFindBulkParticipantQuery (BSDMSessionContext context, TaxExemptionObjectFilter inFilter) {
    queryName = "TaxExemptionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxExemptionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TaxExemptionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TaxExemptionObjectHelper.toMap((TaxExemptionObjectFilter)filter, new HashMap(), "TaxExemption");
    }
  }
  public static TaxExemptionFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxExemptionFindBulkParticipantQuery retVal = new TaxExemptionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxExemptionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxExemption");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TaxExemptionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

