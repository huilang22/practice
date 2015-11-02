package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UnappliedPaymentFindBulkParticipantQuery extends BulkParticipantQuery {

  public UnappliedPaymentFindBulkParticipantQuery (BSDMSessionContext context, UnappliedPaymentObjectFilter inFilter) {
    queryName = "UnappliedPaymentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public UnappliedPaymentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(UnappliedPaymentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return UnappliedPaymentObjectHelper.toMap((UnappliedPaymentObjectFilter)filter, new HashMap(), "UnappliedPayment");
    }
  }
  public static UnappliedPaymentFindBulkParticipantQuery fromQueryMap(Map input) {
    UnappliedPaymentFindBulkParticipantQuery retVal = new UnappliedPaymentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UnappliedPaymentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("UnappliedPayment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(UnappliedPaymentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

