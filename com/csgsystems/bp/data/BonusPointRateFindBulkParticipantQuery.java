package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BonusPointRateFindBulkParticipantQuery extends BulkParticipantQuery {

  public BonusPointRateFindBulkParticipantQuery (BSDMSessionContext context, BonusPointRateObjectFilter inFilter) {
    queryName = "BonusPointRateFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BonusPointRateFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BonusPointRateObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BonusPointRateObjectHelper.toMap((BonusPointRateObjectFilter)filter, new HashMap(), "BonusPointRate");
    }
  }
  public static BonusPointRateFindBulkParticipantQuery fromQueryMap(Map input) {
    BonusPointRateFindBulkParticipantQuery retVal = new BonusPointRateFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BonusPointRateFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BonusPointRate");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BonusPointRateObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

