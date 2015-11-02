package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class OpenItemFindBulkParticipantQuery extends BulkParticipantQuery {

  public OpenItemFindBulkParticipantQuery (BSDMSessionContext context, OpenItemObjectFilter inFilter) {
    queryName = "OpenItemFind";
    filter = inFilter;
    this.setContext(context);
  }
  public OpenItemFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(OpenItemObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return OpenItemObjectHelper.toMap((OpenItemObjectFilter)filter, new HashMap(), "OpenItem");
    }
  }
  public static OpenItemFindBulkParticipantQuery fromQueryMap(Map input) {
    OpenItemFindBulkParticipantQuery retVal = new OpenItemFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("OpenItemFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("OpenItem");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(OpenItemObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

