package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PaymentMerchantIdFindBulkParticipantQuery extends BulkParticipantQuery {

  public PaymentMerchantIdFindBulkParticipantQuery (BSDMSessionContext context, PaymentMerchantIdObjectFilter inFilter) {
    queryName = "PaymentMerchantIdFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PaymentMerchantIdFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PaymentMerchantIdObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PaymentMerchantIdObjectHelper.toMap((PaymentMerchantIdObjectFilter)filter, new HashMap(), "PaymentMerchantId");
    }
  }
  public static PaymentMerchantIdFindBulkParticipantQuery fromQueryMap(Map input) {
    PaymentMerchantIdFindBulkParticipantQuery retVal = new PaymentMerchantIdFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PaymentMerchantIdFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PaymentMerchantId");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PaymentMerchantIdObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

