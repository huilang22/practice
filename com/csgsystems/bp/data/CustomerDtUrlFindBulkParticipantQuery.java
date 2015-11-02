package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CustomerDtUrlFindBulkParticipantQuery extends BulkParticipantQuery {

  public CustomerDtUrlFindBulkParticipantQuery (BSDMSessionContext context, CustomerDtUrlInputObjectFilter inFilter) {
    queryName = "CustomerDtUrlFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CustomerDtUrlFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CustomerDtUrlInputObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CustomerDtUrlInputObjectHelper.toMap((CustomerDtUrlInputObjectFilter)filter, new HashMap(), "CustomerDtUrlFindIn");
    }
  }
  public static CustomerDtUrlFindBulkParticipantQuery fromQueryMap(Map input) {
    CustomerDtUrlFindBulkParticipantQuery retVal = new CustomerDtUrlFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CustomerDtUrlFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CustomerDtUrlFindIn");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CustomerDtUrlInputObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

