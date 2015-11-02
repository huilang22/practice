package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountBonusPointTransactionFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountBonusPointTransactionFindBulkParticipantQuery (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter inFilter) {
    queryName = "AccountBonusPointTransactionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountBonusPointTransactionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountBonusPointTransactionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountBonusPointTransactionObjectHelper.toMap((AccountBonusPointTransactionObjectFilter)filter, new HashMap(), "AccountBonusPointTransaction");
    }
  }
  public static AccountBonusPointTransactionFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountBonusPointTransactionFindBulkParticipantQuery retVal = new AccountBonusPointTransactionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountBonusPointTransactionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountBonusPointTransaction");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountBonusPointTransactionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

