package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExternalIdAcctMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExternalIdAcctMapFindBulkParticipantQuery (BSDMSessionContext context, EIAMObjectFilter inFilter) {
    queryName = "ExternalIdAcctMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExternalIdAcctMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(EIAMObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return EIAMObjectHelper.toMap((EIAMObjectFilter)filter, new HashMap(), "ExternalIdAcctMap");
    }
  }
  public static ExternalIdAcctMapFindBulkParticipantQuery fromQueryMap(Map input) {
    ExternalIdAcctMapFindBulkParticipantQuery retVal = new ExternalIdAcctMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExternalIdAcctMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExternalIdAcctMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(EIAMObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

