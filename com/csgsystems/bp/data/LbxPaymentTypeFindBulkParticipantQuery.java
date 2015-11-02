package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class LbxPaymentTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public LbxPaymentTypeFindBulkParticipantQuery (BSDMSessionContext context, LbxPaymentTypeObjectFilter inFilter) {
    queryName = "LbxPaymentTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public LbxPaymentTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(LbxPaymentTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return LbxPaymentTypeObjectHelper.toMap((LbxPaymentTypeObjectFilter)filter, new HashMap(), "LbxPaymentType");
    }
  }
  public static LbxPaymentTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    LbxPaymentTypeFindBulkParticipantQuery retVal = new LbxPaymentTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("LbxPaymentTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("LbxPaymentType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(LbxPaymentTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

