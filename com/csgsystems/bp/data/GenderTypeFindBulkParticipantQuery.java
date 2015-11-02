package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GenderTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public GenderTypeFindBulkParticipantQuery (BSDMSessionContext context, GenderTypeObjectFilter inFilter) {
    queryName = "GenderTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GenderTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GenderTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GenderTypeObjectHelper.toMap((GenderTypeObjectFilter)filter, new HashMap(), "GenderType");
    }
  }
  public static GenderTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    GenderTypeFindBulkParticipantQuery retVal = new GenderTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GenderTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GenderType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GenderTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

