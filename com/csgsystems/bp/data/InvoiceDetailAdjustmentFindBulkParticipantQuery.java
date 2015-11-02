package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class InvoiceDetailAdjustmentFindBulkParticipantQuery extends BulkParticipantQuery {

  public InvoiceDetailAdjustmentFindBulkParticipantQuery (BSDMSessionContext context, InvoiceDetailObjectFilter inFilter) {
    queryName = "InvoiceDetailAdjustmentFind";
    filter = inFilter;
    this.setContext(context);
  }
  public InvoiceDetailAdjustmentFindBulkParticipantQuery () {
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
  public static InvoiceDetailAdjustmentFindBulkParticipantQuery fromQueryMap(Map input) {
    InvoiceDetailAdjustmentFindBulkParticipantQuery retVal = new InvoiceDetailAdjustmentFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("InvoiceDetailAdjustmentFind");
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

