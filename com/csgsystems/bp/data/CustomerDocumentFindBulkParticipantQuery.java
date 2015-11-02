package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CustomerDocumentFindBulkParticipantQuery extends BulkParticipantQuery {

  public CustomerDocumentFindBulkParticipantQuery (BSDMSessionContext context, CustomerDocumentObjectFilter inFilter) {
    queryName = "CustomerDocumentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CustomerDocumentFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(CustomerDocumentObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return CustomerDocumentObjectHelper.toMap((CustomerDocumentObjectFilter)filter, new HashMap(), "CustomerDocument");
    }
  }
  public static CustomerDocumentFindBulkParticipantQuery fromQueryMap(Map input) {
    CustomerDocumentFindBulkParticipantQuery retVal = new CustomerDocumentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CustomerDocumentFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CustomerDocument");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(CustomerDocumentObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

