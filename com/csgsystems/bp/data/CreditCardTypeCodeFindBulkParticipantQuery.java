package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CreditCardTypeCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public CreditCardTypeCodeFindBulkParticipantQuery (BSDMSessionContext context, CreditCardTypeCodeObjectFilter inFilter) {
    queryName = "CreditCardTypeCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CreditCardTypeCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CreditCardTypeCodeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CreditCardTypeCodeObjectHelper.toMap((CreditCardTypeCodeObjectFilter)filter, new HashMap(), "CreditCardTypeCode");
    }
  }
  public static CreditCardTypeCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    CreditCardTypeCodeFindBulkParticipantQuery retVal = new CreditCardTypeCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CreditCardTypeCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CreditCardTypeCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CreditCardTypeCodeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

