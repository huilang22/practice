package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AbiBillingStatisticsFindBulkParticipantQuery extends BulkParticipantQuery {

  public AbiBillingStatisticsFindBulkParticipantQuery (BSDMSessionContext context, AbiBillingStatisticsObjectFilter inFilter) {
    queryName = "AbiBillingStatisticsFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AbiBillingStatisticsFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AbiBillingStatisticsObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AbiBillingStatisticsObjectHelper.toMap((AbiBillingStatisticsObjectFilter)filter, new HashMap(), "AbiBillingStatistics");
    }
  }
  public static AbiBillingStatisticsFindBulkParticipantQuery fromQueryMap(Map input) {
    AbiBillingStatisticsFindBulkParticipantQuery retVal = new AbiBillingStatisticsFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AbiBillingStatisticsFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AbiBillingStatistics");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AbiBillingStatisticsObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

