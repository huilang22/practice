package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class SalesChannelFindBulkParticipantQuery extends BulkParticipantQuery {

  public SalesChannelFindBulkParticipantQuery (BSDMSessionContext context, SalesChannelObjectFilter inFilter) {
    queryName = "SalesChannelFind";
    filter = inFilter;
    this.setContext(context);
  }
  public SalesChannelFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SalesChannelObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SalesChannelObjectHelper.toMap((SalesChannelObjectFilter)filter, new HashMap(), "SalesChannel");
    }
  }
  public static SalesChannelFindBulkParticipantQuery fromQueryMap(Map input) {
    SalesChannelFindBulkParticipantQuery retVal = new SalesChannelFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("SalesChannelFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("SalesChannel");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SalesChannelObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

