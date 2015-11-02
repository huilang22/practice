package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentDistributionSummaryFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentDistributionSummaryFindBulkParticipantQuery (BSDMSessionContext context, PaymentDistributionObjectFilter inFilter) {
    queryName = "PaymentDistributionSummaryFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentDistributionSummaryFindBulkParticipantQuery () {
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
  public static PaymentDistributionSummaryFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentDistributionSummaryFindBulkParticipantQuery retVal = new PaymentDistributionSummaryFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentDistributionSummaryFind");
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

