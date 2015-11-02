package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountLocateFindByAccountExtendeddataBulkParticipantQuery extends BulkParticipantQuery {

  public AccountLocateFindByAccountExtendeddataBulkParticipantQuery (BSDMSessionContext context, AccountExtendedDataLocateXIDObjectFilter inFilter) {
    queryName = "AccountLocateFindByAccountExtendeddata";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountLocateFindByAccountExtendeddataBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountExtendedDataLocateXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountExtendedDataLocateXIDObjectHelper.toMap((AccountExtendedDataLocateXIDObjectFilter)filter, new HashMap(), "AccountLocate");
    }
  }
  public static AccountLocateFindByAccountExtendeddataBulkParticipantQuery fromQueryMap(Map input) {
    AccountLocateFindByAccountExtendeddataBulkParticipantQuery retVal = new AccountLocateFindByAccountExtendeddataBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountLocateFindByAccountExtendeddata");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountLocate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountExtendedDataLocateXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

