package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BillImageFindBulkParticipantQuery extends BulkParticipantQuery {

  public BillImageFindBulkParticipantQuery (BSDMSessionContext context, BillImageObjectFilter inFilter) {
    queryName = "BillImageFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BillImageFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BillImageObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BillImageObjectHelper.toMap((BillImageObjectFilter)filter, new HashMap(), "BillImage");
    }
  }
  public static BillImageFindBulkParticipantQuery fromQueryMap(Map input) {
    BillImageFindBulkParticipantQuery retVal = new BillImageFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BillImageFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BillImage");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BillImageObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

