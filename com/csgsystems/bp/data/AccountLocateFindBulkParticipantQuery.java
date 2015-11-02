package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountLocateFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountLocateFindBulkParticipantQuery (BSDMSessionContext context, AccountLocateXIDObjectFilter inFilter) {
    queryName = "AccountLocateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountLocateFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountLocateXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountLocateXIDObjectHelper.toMap((AccountLocateXIDObjectFilter)filter, new HashMap(), "AccountLocate");
    }
  }
  public static AccountLocateFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountLocateFindBulkParticipantQuery retVal = new AccountLocateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountLocateFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountLocate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountLocateXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

