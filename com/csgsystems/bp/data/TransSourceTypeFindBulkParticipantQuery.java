package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TransSourceTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public TransSourceTypeFindBulkParticipantQuery (BSDMSessionContext context, TransSourceTypeObjectFilter inFilter) {
    queryName = "TransSourceTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TransSourceTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TransSourceTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TransSourceTypeObjectHelper.toMap((TransSourceTypeObjectFilter)filter, new HashMap(), "TransSourceType");
    }
  }
  public static TransSourceTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    TransSourceTypeFindBulkParticipantQuery retVal = new TransSourceTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TransSourceTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TransSourceType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TransSourceTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

