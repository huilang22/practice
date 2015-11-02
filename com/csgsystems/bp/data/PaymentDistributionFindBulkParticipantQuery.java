package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentDistributionFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentDistributionFindBulkParticipantQuery (BSDMSessionContext context, PaymentDistributionObjectFilter inFilter) {
    queryName = "PaymentDistributionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentDistributionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentDistributionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentDistributionObjectHelper.toMap((PaymentDistributionObjectFilter)filter, new HashMap(), "PaymentDistribution");
    }
  }
  public static PaymentDistributionFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentDistributionFindBulkParticipantQuery retVal = new PaymentDistributionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentDistributionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PaymentDistribution");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentDistributionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

