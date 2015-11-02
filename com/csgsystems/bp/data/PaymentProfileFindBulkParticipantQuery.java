package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentProfileFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentProfileFindBulkParticipantQuery (BSDMSessionContext context, PaymentProfileObjectFilter inFilter) {
    queryName = "PaymentProfileFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentProfileFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentProfileObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentProfileObjectHelper.toMap((PaymentProfileObjectFilter)filter, new HashMap(), "PaymentProfile");
    }
  }
  public static PaymentProfileFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentProfileFindBulkParticipantQuery retVal = new PaymentProfileFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentProfileFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PaymentProfile");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentProfileObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

