package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class BamErrorCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public BamErrorCodeFindBulkParticipantQuery (BSDMSessionContext context, BECObjectFilter inFilter) {
    queryName = "BamErrorCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public BamErrorCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(BECObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return BECObjectHelper.toMap((BECObjectFilter)filter, new HashMap(), "BamErrorCode");
    }
  }
  public static BamErrorCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    BamErrorCodeFindBulkParticipantQuery retVal = new BamErrorCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("BamErrorCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("BamErrorCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(BECObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

