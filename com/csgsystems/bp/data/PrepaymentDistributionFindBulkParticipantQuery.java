package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PrepaymentDistributionFindBulkParticipantQuery extends BulkParticipantQuery {

  public PrepaymentDistributionFindBulkParticipantQuery (BSDMSessionContext context, PrepaymentDistributionObjectFilter inFilter) {
    queryName = "PrepaymentDistributionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PrepaymentDistributionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PrepaymentDistributionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PrepaymentDistributionObjectHelper.toMap((PrepaymentDistributionObjectFilter)filter, new HashMap(), "PrepaymentDistribution");
    }
  }
  public static PrepaymentDistributionFindBulkParticipantQuery fromQueryMap(Map input) {
    PrepaymentDistributionFindBulkParticipantQuery retVal = new PrepaymentDistributionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PrepaymentDistributionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PrepaymentDistribution");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PrepaymentDistributionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

