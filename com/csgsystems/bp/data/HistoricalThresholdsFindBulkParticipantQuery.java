package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HistoricalThresholdsFindBulkParticipantQuery extends BulkParticipantQuery {

  public HistoricalThresholdsFindBulkParticipantQuery (BSDMSessionContext context, HistoricalThresholdsObjectFilter inFilter) {
    queryName = "HistoricalThresholdsFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HistoricalThresholdsFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HistoricalThresholdsObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HistoricalThresholdsObjectHelper.toMap((HistoricalThresholdsObjectFilter)filter, new HashMap(), "HistoricalThresholds");
    }
  }
  public static HistoricalThresholdsFindBulkParticipantQuery fromQueryMap(Map input) {
    HistoricalThresholdsFindBulkParticipantQuery retVal = new HistoricalThresholdsFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HistoricalThresholdsFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HistoricalThresholds");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HistoricalThresholdsObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

