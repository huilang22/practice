package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class SecurityAciFindBulkParticipantQuery extends BulkParticipantQuery {

  public SecurityAciFindBulkParticipantQuery (BSDMSessionContext context, SecurityAciObjectFilter inFilter) {
    queryName = "SecurityAciFind";
    filter = inFilter;
    this.setContext(context);
  }
  public SecurityAciFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SecurityAciObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SecurityAciObjectHelper.toMap((SecurityAciObjectFilter)filter, new HashMap(), "SecurityAci");
    }
  }
  public static SecurityAciFindBulkParticipantQuery fromQueryMap(Map input) {
    SecurityAciFindBulkParticipantQuery retVal = new SecurityAciFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("SecurityAciFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("SecurityAci");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SecurityAciObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

