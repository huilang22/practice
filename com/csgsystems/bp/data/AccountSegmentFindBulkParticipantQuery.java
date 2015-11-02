package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountSegmentFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountSegmentFindBulkParticipantQuery (BSDMSessionContext context, AccountSegmentObjectFilter inFilter) {
    queryName = "AccountSegmentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountSegmentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountSegmentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountSegmentObjectHelper.toMap((AccountSegmentObjectFilter)filter, new HashMap(), "AccountSegment");
    }
  }
  public static AccountSegmentFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountSegmentFindBulkParticipantQuery retVal = new AccountSegmentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountSegmentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountSegment");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountSegmentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

