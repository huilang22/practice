package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class OverrideDiscountRateFindBulkParticipantQuery extends BulkParticipantQuery {

  public OverrideDiscountRateFindBulkParticipantQuery (BSDMSessionContext context, RDOverrideObjectFilter inFilter) {
    queryName = "OverrideDiscountRateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public OverrideDiscountRateFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RDOverrideObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RDOverrideObjectHelper.toMap((RDOverrideObjectFilter)filter, new HashMap(), "OverrideDiscountRate");
    }
  }
  public static OverrideDiscountRateFindBulkParticipantQuery fromQueryMap(Map input) {
    OverrideDiscountRateFindBulkParticipantQuery retVal = new OverrideDiscountRateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("OverrideDiscountRateFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("OverrideDiscountRate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RDOverrideObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

