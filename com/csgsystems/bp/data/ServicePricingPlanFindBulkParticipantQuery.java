package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ServicePricingPlanFindBulkParticipantQuery extends BulkParticipantQuery {

  public ServicePricingPlanFindBulkParticipantQuery (BSDMSessionContext context, ServicePricingPlanObjectFilter inFilter) {
    queryName = "ServicePricingPlanFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ServicePricingPlanFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServicePricingPlanObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServicePricingPlanObjectHelper.toMap((ServicePricingPlanObjectFilter)filter, new HashMap(), "ServicePricingPlan");
    }
  }
  public static ServicePricingPlanFindBulkParticipantQuery fromQueryMap(Map input) {
    ServicePricingPlanFindBulkParticipantQuery retVal = new ServicePricingPlanFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ServicePricingPlanFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ServicePricingPlan");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServicePricingPlanObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

