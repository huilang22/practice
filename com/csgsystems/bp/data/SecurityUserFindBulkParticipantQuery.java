package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class SecurityUserFindBulkParticipantQuery extends BulkParticipantQuery {

  public SecurityUserFindBulkParticipantQuery (BSDMSessionContext context, SecurityUserObjectFilter inFilter) {
    queryName = "SecurityUserFind";
    filter = inFilter;
    this.setContext(context);
  }
  public SecurityUserFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SecurityUserObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SecurityUserObjectHelper.toMap((SecurityUserObjectFilter)filter, new HashMap(), "SecurityUser");
    }
  }
  public static SecurityUserFindBulkParticipantQuery fromQueryMap(Map input) {
    SecurityUserFindBulkParticipantQuery retVal = new SecurityUserFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("SecurityUserFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("SecurityUser");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SecurityUserObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

