package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AdjustmentTaxFindBulkParticipantQuery extends BulkParticipantQuery {

  public AdjustmentTaxFindBulkParticipantQuery (BSDMSessionContext context, AdjustmentTaxObjectFilter inFilter) {
    queryName = "AdjustmentTaxFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AdjustmentTaxFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AdjustmentTaxObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AdjustmentTaxObjectHelper.toMap((AdjustmentTaxObjectFilter)filter, new HashMap(), "AdjustmentTax");
    }
  }
  public static AdjustmentTaxFindBulkParticipantQuery fromQueryMap(Map input) {
    AdjustmentTaxFindBulkParticipantQuery retVal = new AdjustmentTaxFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AdjustmentTaxFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AdjustmentTax");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AdjustmentTaxObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

