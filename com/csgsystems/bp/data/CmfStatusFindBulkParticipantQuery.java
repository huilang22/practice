package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CmfStatusFindBulkParticipantQuery extends BulkParticipantQuery {

  public CmfStatusFindBulkParticipantQuery (BSDMSessionContext context, CmfStatusObjectFilter inFilter) {
    queryName = "CmfStatusFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CmfStatusFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CmfStatusObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CmfStatusObjectHelper.toMap((CmfStatusObjectFilter)filter, new HashMap(), "CmfStatus");
    }
  }
  public static CmfStatusFindBulkParticipantQuery fromQueryMap(Map input) {
    CmfStatusFindBulkParticipantQuery retVal = new CmfStatusFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CmfStatusFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CmfStatus");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CmfStatusObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

