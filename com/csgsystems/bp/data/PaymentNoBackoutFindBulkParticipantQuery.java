package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentNoBackoutFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentNoBackoutFindBulkParticipantQuery (BSDMSessionContext context, PaymentObjectFilter inFilter) {
    queryName = "PaymentNoBackoutFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentNoBackoutFindBulkParticipantQuery () {
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
  public static PaymentNoBackoutFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentNoBackoutFindBulkParticipantQuery retVal = new PaymentNoBackoutFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentNoBackoutFind");
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

