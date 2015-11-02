package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class EftResponseCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public EftResponseCodeFindBulkParticipantQuery (BSDMSessionContext context, EftResponseCodeObjectFilter inFilter) {
    queryName = "EftResponseCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public EftResponseCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(EftResponseCodeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return EftResponseCodeObjectHelper.toMap((EftResponseCodeObjectFilter)filter, new HashMap(), "EftResponseCode");
    }
  }
  public static EftResponseCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    EftResponseCodeFindBulkParticipantQuery retVal = new EftResponseCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("EftResponseCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("EftResponseCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(EftResponseCodeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

