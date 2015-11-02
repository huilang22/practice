package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class HqGroupContractsFindBulkParticipantQuery extends BulkParticipantQuery {

  public HqGroupContractsFindBulkParticipantQuery (BSDMSessionContext context, HqGroupContractsObjectFilter inFilter) {
    queryName = "HqGroupContractsFind";
    filter = inFilter;
    this.setContext(context);
  }
  public HqGroupContractsFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(HqGroupContractsObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return HqGroupContractsObjectHelper.toMap((HqGroupContractsObjectFilter)filter, new HashMap(), "HqGroupContracts");
    }
  }
  public static HqGroupContractsFindBulkParticipantQuery fromQueryMap(Map input) {
    HqGroupContractsFindBulkParticipantQuery retVal = new HqGroupContractsFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("HqGroupContractsFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("HqGroupContracts");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(HqGroupContractsObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

