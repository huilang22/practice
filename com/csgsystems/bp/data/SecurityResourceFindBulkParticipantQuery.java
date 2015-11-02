package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class SecurityResourceFindBulkParticipantQuery extends BulkParticipantQuery {

  public SecurityResourceFindBulkParticipantQuery (BSDMSessionContext context, SecurityResourceObjectFilter inFilter) {
    queryName = "SecurityResourceFind";
    filter = inFilter;
    this.setContext(context);
  }
  public SecurityResourceFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SecurityResourceObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SecurityResourceObjectHelper.toMap((SecurityResourceObjectFilter)filter, new HashMap(), "SecurityResource");
    }
  }
  public static SecurityResourceFindBulkParticipantQuery fromQueryMap(Map input) {
    SecurityResourceFindBulkParticipantQuery retVal = new SecurityResourceFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("SecurityResourceFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("SecurityResource");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SecurityResourceObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

