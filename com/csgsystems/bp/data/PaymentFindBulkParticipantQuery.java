package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentFindBulkParticipantQuery (BSDMSessionContext context, PaymentObjectFilter inFilter) {
    queryName = "PaymentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentObjectHelper.toMap((PaymentObjectFilter)filter, new HashMap(), "Payment");
    }
  }
  public static PaymentFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentFindBulkParticipantQuery retVal = new PaymentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Payment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

