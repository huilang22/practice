package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HistoricalContributionFindBulkParticipantQuery extends BulkParticipantQuery {

  public HistoricalContributionFindBulkParticipantQuery (BSDMSessionContext context, HistoricalContributionObjectFilter inFilter) {
    queryName = "HistoricalContributionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HistoricalContributionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HistoricalContributionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HistoricalContributionObjectHelper.toMap((HistoricalContributionObjectFilter)filter, new HashMap(), "HistoricalContribution");
    }
  }
  public static HistoricalContributionFindBulkParticipantQuery fromQueryMap(Map input) {
    HistoricalContributionFindBulkParticipantQuery retVal = new HistoricalContributionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HistoricalContributionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HistoricalContribution");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HistoricalContributionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

