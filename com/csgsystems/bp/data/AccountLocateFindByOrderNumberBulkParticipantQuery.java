package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountLocateFindByOrderNumberBulkParticipantQuery extends BulkParticipantQuery {

  public AccountLocateFindByOrderNumberBulkParticipantQuery (BSDMSessionContext context, OrderLocateXIDObjectFilter inFilter) {
    queryName = "AccountLocateFindByOrderNumber";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountLocateFindByOrderNumberBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(OrderLocateXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return OrderLocateXIDObjectHelper.toMap((OrderLocateXIDObjectFilter)filter, new HashMap(), "AccountLocate");
    }
  }
  public static AccountLocateFindByOrderNumberBulkParticipantQuery fromQueryMap(Map input) {
    AccountLocateFindByOrderNumberBulkParticipantQuery retVal = new AccountLocateFindByOrderNumberBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountLocateFindByOrderNumber");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountLocate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(OrderLocateXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

