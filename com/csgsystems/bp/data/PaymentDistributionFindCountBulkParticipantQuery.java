package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentDistributionFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentDistributionFindCountBulkParticipantQuery (BSDMSessionContext context, PaymentDistributionObjectFilter inFilter) {
    queryName = "PaymentDistributionFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentDistributionFindCountBulkParticipantQuery () {
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
  public static PaymentDistributionFindCountBulkParticipantQuery fromQueryMap(Map input) {
    PaymentDistributionFindCountBulkParticipantQuery retVal = new PaymentDistributionFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentDistributionFindCount");
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

