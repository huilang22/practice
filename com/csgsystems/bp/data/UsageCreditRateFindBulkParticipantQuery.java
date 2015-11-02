package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class UsageCreditRateFindBulkParticipantQuery extends BulkParticipantQuery {

  public UsageCreditRateFindBulkParticipantQuery (BSDMSessionContext context, RUCreditObjectFilter inFilter) {
    queryName = "UsageCreditRateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public UsageCreditRateFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(RUCreditObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return RUCreditObjectHelper.toMap((RUCreditObjectFilter)filter, new HashMap(), "UsageCreditRate");
    }
  }
  public static UsageCreditRateFindBulkParticipantQuery fromQueryMap(Map input) {
    UsageCreditRateFindBulkParticipantQuery retVal = new UsageCreditRateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("UsageCreditRateFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("UsageCreditRate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(RUCreditObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

