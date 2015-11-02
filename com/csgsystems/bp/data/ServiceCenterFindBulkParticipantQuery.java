package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServiceCenterFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServiceCenterFindBulkParticipantQuery (BSDMSessionContext context, ServiceCenterObjectFilter inFilter) {
    queryName = "ServiceCenterFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServiceCenterFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServiceCenterObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServiceCenterObjectHelper.toMap((ServiceCenterObjectFilter)filter, new HashMap(), "ServiceCenter");
    }
  }
  public static ServiceCenterFindBulkParticipantQuery fromQueryMap(Map input) {
    ServiceCenterFindBulkParticipantQuery retVal = new ServiceCenterFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServiceCenterFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServiceCenter");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServiceCenterObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

