package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServiceZoneFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServiceZoneFindBulkParticipantQuery (BSDMSessionContext context, ServiceZoneObjectFilter inFilter) {
    queryName = "ServiceZoneFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServiceZoneFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServiceZoneObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServiceZoneObjectHelper.toMap((ServiceZoneObjectFilter)filter, new HashMap(), "ServiceZone");
    }
  }
  public static ServiceZoneFindBulkParticipantQuery fromQueryMap(Map input) {
    ServiceZoneFindBulkParticipantQuery retVal = new ServiceZoneFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServiceZoneFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServiceZone");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServiceZoneObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

