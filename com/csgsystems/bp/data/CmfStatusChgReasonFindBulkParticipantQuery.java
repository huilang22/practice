package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CmfStatusChgReasonFindBulkParticipantQuery extends BulkParticipantQuery {

  public CmfStatusChgReasonFindBulkParticipantQuery (BSDMSessionContext context, CmfStatusChgReasonObjectFilter inFilter) {
    queryName = "CmfStatusChgReasonFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CmfStatusChgReasonFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CmfStatusChgReasonObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CmfStatusChgReasonObjectHelper.toMap((CmfStatusChgReasonObjectFilter)filter, new HashMap(), "CmfStatusChgReason");
    }
  }
  public static CmfStatusChgReasonFindBulkParticipantQuery fromQueryMap(Map input) {
    CmfStatusChgReasonFindBulkParticipantQuery retVal = new CmfStatusChgReasonFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CmfStatusChgReasonFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CmfStatusChgReason");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CmfStatusChgReasonObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

