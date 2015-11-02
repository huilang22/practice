package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CustomerServiceCenterFindBulkParticipantQuery extends BulkParticipantQuery {

  public CustomerServiceCenterFindBulkParticipantQuery (BSDMSessionContext context, CustomerServiceCenterObjectFilter inFilter) {
    queryName = "CustomerServiceCenterFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CustomerServiceCenterFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CustomerServiceCenterObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CustomerServiceCenterObjectHelper.toMap((CustomerServiceCenterObjectFilter)filter, new HashMap(), "CustomerServiceCenter");
    }
  }
  public static CustomerServiceCenterFindBulkParticipantQuery fromQueryMap(Map input) {
    CustomerServiceCenterFindBulkParticipantQuery retVal = new CustomerServiceCenterFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CustomerServiceCenterFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CustomerServiceCenter");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CustomerServiceCenterObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

