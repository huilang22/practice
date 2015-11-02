package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentTransFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentTransFindBulkParticipantQuery (BSDMSessionContext context, PaymentTransObjectFilter inFilter) {
    queryName = "PaymentTransFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentTransFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentTransObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentTransObjectHelper.toMap((PaymentTransObjectFilter)filter, new HashMap(), "PaymentTrans");
    }
  }
  public static PaymentTransFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentTransFindBulkParticipantQuery retVal = new PaymentTransFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentTransFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PaymentTrans");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentTransObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

