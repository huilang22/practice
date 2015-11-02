package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AdjustmentTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public AdjustmentTypeFindBulkParticipantQuery (BSDMSessionContext context, AdjustmentTypeObjectFilter inFilter) {
    queryName = "AdjustmentTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AdjustmentTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AdjustmentTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AdjustmentTypeObjectHelper.toMap((AdjustmentTypeObjectFilter)filter, new HashMap(), "AdjustmentType");
    }
  }
  public static AdjustmentTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    AdjustmentTypeFindBulkParticipantQuery retVal = new AdjustmentTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AdjustmentTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AdjustmentType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AdjustmentTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

