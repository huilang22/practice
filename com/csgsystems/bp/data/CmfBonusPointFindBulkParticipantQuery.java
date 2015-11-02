package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CmfBonusPointFindBulkParticipantQuery extends BulkParticipantQuery {

  public CmfBonusPointFindBulkParticipantQuery (BSDMSessionContext context, CmfBonusPointObjectFilter inFilter) {
    queryName = "CmfBonusPointFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CmfBonusPointFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CmfBonusPointObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CmfBonusPointObjectHelper.toMap((CmfBonusPointObjectFilter)filter, new HashMap(), "CmfBonusPoint");
    }
  }
  public static CmfBonusPointFindBulkParticipantQuery fromQueryMap(Map input) {
    CmfBonusPointFindBulkParticipantQuery retVal = new CmfBonusPointFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CmfBonusPointFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CmfBonusPoint");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CmfBonusPointObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

