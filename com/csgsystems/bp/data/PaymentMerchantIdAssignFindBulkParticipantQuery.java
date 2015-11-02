package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentMerchantIdAssignFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentMerchantIdAssignFindBulkParticipantQuery (BSDMSessionContext context, PaymentMerchantIdAssignObjectFilter inFilter) {
    queryName = "PaymentMerchantIdAssignFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentMerchantIdAssignFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentMerchantIdAssignObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentMerchantIdAssignObjectHelper.toMap((PaymentMerchantIdAssignObjectFilter)filter, new HashMap(), "PaymentMerchantIdAssign");
    }
  }
  public static PaymentMerchantIdAssignFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentMerchantIdAssignFindBulkParticipantQuery retVal = new PaymentMerchantIdAssignFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentMerchantIdAssignFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PaymentMerchantIdAssign");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentMerchantIdAssignObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

