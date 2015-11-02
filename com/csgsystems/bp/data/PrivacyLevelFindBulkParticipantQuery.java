package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PrivacyLevelFindBulkParticipantQuery extends BulkParticipantQuery {

  public PrivacyLevelFindBulkParticipantQuery (BSDMSessionContext context, PrivacyLevelObjectFilter inFilter) {
    queryName = "PrivacyLevelFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PrivacyLevelFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PrivacyLevelObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PrivacyLevelObjectHelper.toMap((PrivacyLevelObjectFilter)filter, new HashMap(), "PrivacyLevel");
    }
  }
  public static PrivacyLevelFindBulkParticipantQuery fromQueryMap(Map input) {
    PrivacyLevelFindBulkParticipantQuery retVal = new PrivacyLevelFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PrivacyLevelFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PrivacyLevel");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PrivacyLevelObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

