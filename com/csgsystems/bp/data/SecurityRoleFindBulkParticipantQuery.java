package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class SecurityRoleFindBulkParticipantQuery extends BulkParticipantQuery {

  public SecurityRoleFindBulkParticipantQuery (BSDMSessionContext context, SecurityRoleObjectFilter inFilter) {
    queryName = "SecurityRoleFind";
    filter = inFilter;
    this.setContext(context);
  }
  public SecurityRoleFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SecurityRoleObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SecurityRoleObjectHelper.toMap((SecurityRoleObjectFilter)filter, new HashMap(), "SecurityRole");
    }
  }
  public static SecurityRoleFindBulkParticipantQuery fromQueryMap(Map input) {
    SecurityRoleFindBulkParticipantQuery retVal = new SecurityRoleFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("SecurityRoleFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("SecurityRole");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SecurityRoleObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

