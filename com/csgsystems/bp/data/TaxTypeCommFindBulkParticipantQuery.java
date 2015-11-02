package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxTypeCommFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxTypeCommFindBulkParticipantQuery (BSDMSessionContext context, TTCObjectFilter inFilter) {
    queryName = "TaxTypeCommFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxTypeCommFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TTCObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TTCObjectHelper.toMap((TTCObjectFilter)filter, new HashMap(), "TaxTypeComm");
    }
  }
  public static TaxTypeCommFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxTypeCommFindBulkParticipantQuery retVal = new TaxTypeCommFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxTypeCommFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxTypeComm");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TTCObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

