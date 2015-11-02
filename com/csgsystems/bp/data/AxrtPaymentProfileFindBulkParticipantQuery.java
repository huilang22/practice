package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AxrtPaymentProfileFindBulkParticipantQuery extends BulkParticipantQuery {

  public AxrtPaymentProfileFindBulkParticipantQuery (BSDMSessionContext context, AxrtPaymentProfileObjectFilter inFilter) {
    queryName = "AxrtPaymentProfileFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AxrtPaymentProfileFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AxrtPaymentProfileObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AxrtPaymentProfileObjectHelper.toMap((AxrtPaymentProfileObjectFilter)filter, new HashMap(), "AxrtPaymentProfile");
    }
  }
  public static AxrtPaymentProfileFindBulkParticipantQuery fromQueryMap(Map input) {
    AxrtPaymentProfileFindBulkParticipantQuery retVal = new AxrtPaymentProfileFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AxrtPaymentProfileFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AxrtPaymentProfile");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AxrtPaymentProfileObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

