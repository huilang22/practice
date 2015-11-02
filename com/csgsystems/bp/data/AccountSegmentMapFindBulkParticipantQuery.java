package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountSegmentMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public AccountSegmentMapFindBulkParticipantQuery (BSDMSessionContext context, AccountSegmentMapObjectFilter inFilter) {
    queryName = "AccountSegmentMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountSegmentMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AccountSegmentMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AccountSegmentMapObjectHelper.toMap((AccountSegmentMapObjectFilter)filter, new HashMap(), "AccountSegmentMap");
    }
  }
  public static AccountSegmentMapFindBulkParticipantQuery fromQueryMap(Map input) {
    AccountSegmentMapFindBulkParticipantQuery retVal = new AccountSegmentMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountSegmentMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AccountSegmentMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AccountSegmentMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

