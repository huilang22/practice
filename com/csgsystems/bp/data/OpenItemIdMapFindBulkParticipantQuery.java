package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class OpenItemIdMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public OpenItemIdMapFindBulkParticipantQuery (BSDMSessionContext context, OpenItemIdMapObjectFilter inFilter) {
    queryName = "OpenItemIdMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public OpenItemIdMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(OpenItemIdMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return OpenItemIdMapObjectHelper.toMap((OpenItemIdMapObjectFilter)filter, new HashMap(), "OpenItemIdMap");
    }
  }
  public static OpenItemIdMapFindBulkParticipantQuery fromQueryMap(Map input) {
    OpenItemIdMapFindBulkParticipantQuery retVal = new OpenItemIdMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("OpenItemIdMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("OpenItemIdMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(OpenItemIdMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

