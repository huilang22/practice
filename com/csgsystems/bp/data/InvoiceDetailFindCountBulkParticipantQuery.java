package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class InvoiceDetailFindCountBulkParticipantQuery extends BulkParticipantQuery {

  public InvoiceDetailFindCountBulkParticipantQuery (BSDMSessionContext context, InvoiceDetailObjectFilter inFilter) {
    queryName = "InvoiceDetailFindCount";
    filter = inFilter;
    this.setContext(context);
  }
  public InvoiceDetailFindCountBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(InvoiceDetailObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return InvoiceDetailObjectHelper.toMap((InvoiceDetailObjectFilter)filter, new HashMap(), "InvoiceDetail");
    }
  }
  public static InvoiceDetailFindCountBulkParticipantQuery fromQueryMap(Map input) {
    InvoiceDetailFindCountBulkParticipantQuery retVal = new InvoiceDetailFindCountBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("InvoiceDetailFindCount");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("InvoiceDetail");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(InvoiceDetailObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

