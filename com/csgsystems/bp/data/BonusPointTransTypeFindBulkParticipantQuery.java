package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BonusPointTransTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public BonusPointTransTypeFindBulkParticipantQuery (BSDMSessionContext context, BonusPointTransTypeObjectFilter inFilter) {
    queryName = "BonusPointTransTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BonusPointTransTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BonusPointTransTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BonusPointTransTypeObjectHelper.toMap((BonusPointTransTypeObjectFilter)filter, new HashMap(), "BonusPointTransType");
    }
  }
  public static BonusPointTransTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    BonusPointTransTypeFindBulkParticipantQuery retVal = new BonusPointTransTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BonusPointTransTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BonusPointTransType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BonusPointTransTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

