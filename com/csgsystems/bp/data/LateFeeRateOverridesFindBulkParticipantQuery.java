package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class LateFeeRateOverridesFindBulkParticipantQuery extends BulkParticipantQuery {

  public LateFeeRateOverridesFindBulkParticipantQuery (BSDMSessionContext context, LateFeeRateOverridesObjectFilter inFilter) {
    queryName = "LateFeeRateOverridesFind";
    filter = inFilter;
    this.setContext(context);
  }
  public LateFeeRateOverridesFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(LateFeeRateOverridesObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return LateFeeRateOverridesObjectHelper.toMap((LateFeeRateOverridesObjectFilter)filter, new HashMap(), "LateFeeRateOverrides");
    }
  }
  public static LateFeeRateOverridesFindBulkParticipantQuery fromQueryMap(Map input) {
    LateFeeRateOverridesFindBulkParticipantQuery retVal = new LateFeeRateOverridesFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("LateFeeRateOverridesFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("LateFeeRateOverrides");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(LateFeeRateOverridesObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

