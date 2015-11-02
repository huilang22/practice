package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CcAuditLogFindBulkParticipantQuery extends BulkParticipantQuery {

  public CcAuditLogFindBulkParticipantQuery (BSDMSessionContext context, CcAuditLogObjectFilter inFilter) {
    queryName = "CcAuditLogFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CcAuditLogFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CcAuditLogObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CcAuditLogObjectHelper.toMap((CcAuditLogObjectFilter)filter, new HashMap(), "CcAuditLog");
    }
  }
  public static CcAuditLogFindBulkParticipantQuery fromQueryMap(Map input) {
    CcAuditLogFindBulkParticipantQuery retVal = new CcAuditLogFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CcAuditLogFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CcAuditLog");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CcAuditLogObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

