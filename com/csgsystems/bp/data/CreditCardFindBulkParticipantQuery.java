package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CreditCardFindBulkParticipantQuery extends BulkParticipantQuery {

  public CreditCardFindBulkParticipantQuery (BSDMSessionContext context, CreditCardObjectFilter inFilter) {
    queryName = "CreditCardFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CreditCardFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CreditCardObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CreditCardObjectHelper.toMap((CreditCardObjectFilter)filter, new HashMap(), "CreditCard");
    }
  }
  public static CreditCardFindBulkParticipantQuery fromQueryMap(Map input) {
    CreditCardFindBulkParticipantQuery retVal = new CreditCardFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CreditCardFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CreditCard");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CreditCardObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

