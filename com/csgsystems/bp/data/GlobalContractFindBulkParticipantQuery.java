package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GlobalContractFindBulkParticipantQuery extends BulkParticipantQuery {

  public GlobalContractFindBulkParticipantQuery (BSDMSessionContext context, GlobalContractObjectFilter inFilter) {
    queryName = "GlobalContractFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GlobalContractFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GlobalContractObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GlobalContractObjectHelper.toMap((GlobalContractObjectFilter)filter, new HashMap(), "GlobalContract");
    }
  }
  public static GlobalContractFindBulkParticipantQuery fromQueryMap(Map input) {
    GlobalContractFindBulkParticipantQuery retVal = new GlobalContractFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GlobalContractFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GlobalContract");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GlobalContractObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

