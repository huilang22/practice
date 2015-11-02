package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ChargeDistribPercentFindBulkParticipantQuery extends BulkParticipantQuery {

  public ChargeDistribPercentFindBulkParticipantQuery (BSDMSessionContext context, ChargeDistribPercentObjectFilter inFilter) {
    queryName = "ChargeDistribPercentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ChargeDistribPercentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ChargeDistribPercentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ChargeDistribPercentObjectHelper.toMap((ChargeDistribPercentObjectFilter)filter, new HashMap(), "ChargeDistribPercent");
    }
  }
  public static ChargeDistribPercentFindBulkParticipantQuery fromQueryMap(Map input) {
    ChargeDistribPercentFindBulkParticipantQuery retVal = new ChargeDistribPercentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ChargeDistribPercentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ChargeDistribPercent");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ChargeDistribPercentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

