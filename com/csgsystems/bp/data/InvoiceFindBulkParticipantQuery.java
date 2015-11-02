package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class InvoiceFindBulkParticipantQuery extends BulkParticipantQuery {

  public InvoiceFindBulkParticipantQuery (BSDMSessionContext context, InvoiceObjectFilter inFilter) {
    queryName = "InvoiceFind";
    filter = inFilter;
    this.setContext(context);
  }
  public InvoiceFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(InvoiceObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return InvoiceObjectHelper.toMap((InvoiceObjectFilter)filter, new HashMap(), "Invoice");
    }
  }
  public static InvoiceFindBulkParticipantQuery fromQueryMap(Map input) {
    InvoiceFindBulkParticipantQuery retVal = new InvoiceFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("InvoiceFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Invoice");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(InvoiceObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

