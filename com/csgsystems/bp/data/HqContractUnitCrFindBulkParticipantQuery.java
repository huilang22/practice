package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqContractUnitCrFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqContractUnitCrFindBulkParticipantQuery (BSDMSessionContext context, HqContractUnitCrObjectFilter inFilter) {
    queryName = "HqContractUnitCrFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqContractUnitCrFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqContractUnitCrObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqContractUnitCrObjectHelper.toMap((HqContractUnitCrObjectFilter)filter, new HashMap(), "HqContractUnitCr");
    }
  }
  public static HqContractUnitCrFindBulkParticipantQuery fromQueryMap(Map input) {
    HqContractUnitCrFindBulkParticipantQuery retVal = new HqContractUnitCrFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqContractUnitCrFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqContractUnitCr");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqContractUnitCrObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

