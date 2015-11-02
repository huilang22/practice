package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountBonusPointTransactionFindbyRewardbalanceBulkParticipantQuery extends BulkParticipantQuery {

  public AccountBonusPointTransactionFindbyRewardbalanceBulkParticipantQuery (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter inFilter) {
    queryName = "AccountBonusPointTransactionFindbyRewardbalance";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountBonusPointTransactionFindbyRewardbalanceBulkParticipantQuery () {
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
  public static AccountBonusPointTransactionFindbyRewardbalanceBulkParticipantQuery fromQueryMap(Map input) {
    AccountBonusPointTransactionFindbyRewardbalanceBulkParticipantQuery retVal = new AccountBonusPointTransactionFindbyRewardbalanceBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountBonusPointTransactionFindbyRewardbalance");
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

