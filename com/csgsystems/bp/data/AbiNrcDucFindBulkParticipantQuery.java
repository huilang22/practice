package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AbiNrcDucFindBulkParticipantQuery extends BulkParticipantQuery {

  public AbiNrcDucFindBulkParticipantQuery (BSDMSessionContext context, AbiNrcDucObjectFilter inFilter) {
    queryName = "AbiNrcDucFind";
    filter = inFilter;
    this.setContext(context);
  }
  public AbiNrcDucFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AbiNrcDucObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AbiNrcDucObjectHelper.toMap((AbiNrcDucObjectFilter)filter, new HashMap(), "AbiNrcDuc");
    }
  }
  public static AbiNrcDucFindBulkParticipantQuery fromQueryMap(Map input) {
    AbiNrcDucFindBulkParticipantQuery retVal = new AbiNrcDucFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AbiNrcDucFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AbiNrcDuc");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AbiNrcDucObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

