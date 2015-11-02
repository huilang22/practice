package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HistoricalContributionTaxFindBulkParticipantQuery extends BulkParticipantQuery {

  public HistoricalContributionTaxFindBulkParticipantQuery (BSDMSessionContext context, HistoricalContributionTaxObjectFilter inFilter) {
    queryName = "HistoricalContributionTaxFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HistoricalContributionTaxFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HistoricalContributionTaxObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HistoricalContributionTaxObjectHelper.toMap((HistoricalContributionTaxObjectFilter)filter, new HashMap(), "HistoricalContributionTax");
    }
  }
  public static HistoricalContributionTaxFindBulkParticipantQuery fromQueryMap(Map input) {
    HistoricalContributionTaxFindBulkParticipantQuery retVal = new HistoricalContributionTaxFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HistoricalContributionTaxFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HistoricalContributionTax");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HistoricalContributionTaxObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

