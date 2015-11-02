package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class InvoiceDetailFindBulkParticipantQuery extends BulkParticipantQuery {

  public InvoiceDetailFindBulkParticipantQuery (BSDMSessionContext context, InvoiceDetailObjectFilter inFilter) {
    queryName = "InvoiceDetailFind";
    filter = inFilter;
    this.setContext(context);
  }
  public InvoiceDetailFindBulkParticipantQuery () {
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
  public static InvoiceDetailFindBulkParticipantQuery fromQueryMap(Map input) {
    InvoiceDetailFindBulkParticipantQuery retVal = new InvoiceDetailFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("InvoiceDetailFind");
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

