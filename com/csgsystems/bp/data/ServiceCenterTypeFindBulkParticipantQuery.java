package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServiceCenterTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServiceCenterTypeFindBulkParticipantQuery (BSDMSessionContext context, ServiceCenterTypeObjectFilter inFilter) {
    queryName = "ServiceCenterTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServiceCenterTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServiceCenterTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServiceCenterTypeObjectHelper.toMap((ServiceCenterTypeObjectFilter)filter, new HashMap(), "ServiceCenterType");
    }
  }
  public static ServiceCenterTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    ServiceCenterTypeFindBulkParticipantQuery retVal = new ServiceCenterTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServiceCenterTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServiceCenterType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServiceCenterTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

