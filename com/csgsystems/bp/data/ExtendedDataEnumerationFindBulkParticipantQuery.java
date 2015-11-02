package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExtendedDataEnumerationFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExtendedDataEnumerationFindBulkParticipantQuery (BSDMSessionContext context, EDObjectFilter inFilter) {
    queryName = "ExtendedDataEnumerationFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExtendedDataEnumerationFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(EDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return EDObjectHelper.toMap((EDObjectFilter)filter, new HashMap(), "ExtendedDataEnumeration");
    }
  }
  public static ExtendedDataEnumerationFindBulkParticipantQuery fromQueryMap(Map input) {
    ExtendedDataEnumerationFindBulkParticipantQuery retVal = new ExtendedDataEnumerationFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExtendedDataEnumerationFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExtendedDataEnumeration");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(EDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

