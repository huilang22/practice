package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class InvoiceReissueFindBulkParticipantQuery extends BulkParticipantQuery {

  public InvoiceReissueFindBulkParticipantQuery (BSDMSessionContext context, InvoiceObjectFilter inFilter) {
    queryName = "InvoiceReissueFind";
    filter = inFilter;
    this.setContext(context);
  }
  public InvoiceReissueFindBulkParticipantQuery () {
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
  public static InvoiceReissueFindBulkParticipantQuery fromQueryMap(Map input) {
    InvoiceReissueFindBulkParticipantQuery retVal = new InvoiceReissueFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("InvoiceReissueFind");
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

