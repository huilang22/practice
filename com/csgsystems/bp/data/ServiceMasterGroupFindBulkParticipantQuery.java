package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServiceMasterGroupFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServiceMasterGroupFindBulkParticipantQuery (BSDMSessionContext context, ServiceMasterGroupObjectFilter inFilter) {
    queryName = "ServiceMasterGroupFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServiceMasterGroupFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServiceMasterGroupObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServiceMasterGroupObjectHelper.toMap((ServiceMasterGroupObjectFilter)filter, new HashMap(), "ServiceMasterGroup");
    }
  }
  public static ServiceMasterGroupFindBulkParticipantQuery fromQueryMap(Map input) {
    ServiceMasterGroupFindBulkParticipantQuery retVal = new ServiceMasterGroupFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServiceMasterGroupFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServiceMasterGroup");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServiceMasterGroupObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

