package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CustomerDtServerFindBulkParticipantQuery extends BulkParticipantQuery {

  public CustomerDtServerFindBulkParticipantQuery (BSDMSessionContext context, CustomerDtServerObjectFilter inFilter) {
    queryName = "CustomerDtServerFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CustomerDtServerFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CustomerDtServerObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CustomerDtServerObjectHelper.toMap((CustomerDtServerObjectFilter)filter, new HashMap(), "CustomerDtServer");
    }
  }
  public static CustomerDtServerFindBulkParticipantQuery fromQueryMap(Map input) {
    CustomerDtServerFindBulkParticipantQuery retVal = new CustomerDtServerFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CustomerDtServerFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CustomerDtServer");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CustomerDtServerObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

