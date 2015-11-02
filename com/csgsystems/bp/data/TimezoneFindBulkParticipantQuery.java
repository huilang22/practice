package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TimezoneFindBulkParticipantQuery extends BulkParticipantQuery {

  public TimezoneFindBulkParticipantQuery (BSDMSessionContext context, TimezoneObjectFilter inFilter) {
    queryName = "TimezoneFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TimezoneFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TimezoneObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TimezoneObjectHelper.toMap((TimezoneObjectFilter)filter, new HashMap(), "Timezone");
    }
  }
  public static TimezoneFindBulkParticipantQuery fromQueryMap(Map input) {
    TimezoneFindBulkParticipantQuery retVal = new TimezoneFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TimezoneFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Timezone");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TimezoneObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

