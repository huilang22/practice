package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GenericEnumerationFindBulkParticipantQuery extends BulkParticipantQuery {

  public GenericEnumerationFindBulkParticipantQuery (BSDMSessionContext context, GEObjectFilter inFilter) {
    queryName = "GenericEnumerationFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GenericEnumerationFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GEObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GEObjectHelper.toMap((GEObjectFilter)filter, new HashMap(), "GenericEnumeration");
    }
  }
  public static GenericEnumerationFindBulkParticipantQuery fromQueryMap(Map input) {
    GenericEnumerationFindBulkParticipantQuery retVal = new GenericEnumerationFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GenericEnumerationFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GenericEnumeration");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GEObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

