package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountBonusPointBalanceFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountBonusPointBalanceFindBulkParticipantQuery (BSDMSessionContext context, AccountBonusPointBalanceObjectFilter inFilter) {
    queryName = "AccountBonusPointBalanceFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountBonusPointBalanceFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountBonusPointBalanceObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountBonusPointBalanceObjectHelper.toMap((AccountBonusPointBalanceObjectFilter)filter, new HashMap(), "AccountBonusPointBalance");
    }
  }
  public static AccountBonusPointBalanceFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountBonusPointBalanceFindBulkParticipantQuery retVal = new AccountBonusPointBalanceFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountBonusPointBalanceFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountBonusPointBalance");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountBonusPointBalanceObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

