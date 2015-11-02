package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class GuiIndicatorFindBulkParticipantQuery extends BulkParticipantQuery {

  public GuiIndicatorFindBulkParticipantQuery (BSDMSessionContext context, GuiIndicatorObjectFilter inFilter) {
    queryName = "GuiIndicatorFind";
    filter = inFilter;
    this.setContext(context);
  }
  public GuiIndicatorFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(GuiIndicatorObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return GuiIndicatorObjectHelper.toMap((GuiIndicatorObjectFilter)filter, new HashMap(), "GuiIndicator");
    }
  }
  public static GuiIndicatorFindBulkParticipantQuery fromQueryMap(Map input) {
    GuiIndicatorFindBulkParticipantQuery retVal = new GuiIndicatorFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("GuiIndicatorFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("GuiIndicator");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(GuiIndicatorObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

