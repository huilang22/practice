package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountHqContractFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountHqContractFindBulkParticipantQuery (BSDMSessionContext context, AccountHqContractObjectFilter inFilter) {
    queryName = "AccountHqContractFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountHqContractFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountHqContractObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountHqContractObjectHelper.toMap((AccountHqContractObjectFilter)filter, new HashMap(), "AccountHqContract");
    }
  }
  public static AccountHqContractFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountHqContractFindBulkParticipantQuery retVal = new AccountHqContractFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountHqContractFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountHqContract");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountHqContractObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

