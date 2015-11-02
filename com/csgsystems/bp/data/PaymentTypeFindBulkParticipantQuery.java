package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentTypeFindBulkParticipantQuery (BSDMSessionContext context, PaymentTypeObjectFilter inFilter) {
    queryName = "PaymentTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentTypeObjectHelper.toMap((PaymentTypeObjectFilter)filter, new HashMap(), "PaymentType");
    }
  }
  public static PaymentTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentTypeFindBulkParticipantQuery retVal = new PaymentTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PaymentType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

