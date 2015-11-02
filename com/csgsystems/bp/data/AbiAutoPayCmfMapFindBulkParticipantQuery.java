package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AbiAutoPayCmfMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public AbiAutoPayCmfMapFindBulkParticipantQuery (BSDMSessionContext context, AbiAutoPayCmfMapObjectFilter inFilter) {
    queryName = "AbiAutoPayCmfMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AbiAutoPayCmfMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AbiAutoPayCmfMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AbiAutoPayCmfMapObjectHelper.toMap((AbiAutoPayCmfMapObjectFilter)filter, new HashMap(), "AbiAutoPayCmfMap");
    }
  }
  public static AbiAutoPayCmfMapFindBulkParticipantQuery fromQueryMap(Map input) {
    AbiAutoPayCmfMapFindBulkParticipantQuery retVal = new AbiAutoPayCmfMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AbiAutoPayCmfMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AbiAutoPayCmfMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AbiAutoPayCmfMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

