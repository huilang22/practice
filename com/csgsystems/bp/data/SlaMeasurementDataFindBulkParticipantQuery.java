package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class SlaMeasurementDataFindBulkParticipantQuery extends BulkParticipantQuery {

  public SlaMeasurementDataFindBulkParticipantQuery (BSDMSessionContext context, SlaMeasurementDataObjectFilter inFilter) {
    queryName = "SlaMeasurementDataFind";
    filter = inFilter;
    this.setContext(context);
  }
  public SlaMeasurementDataFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(SlaMeasurementDataObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return SlaMeasurementDataObjectHelper.toMap((SlaMeasurementDataObjectFilter)filter, new HashMap(), "SlaMeasurementData");
    }
  }
  public static SlaMeasurementDataFindBulkParticipantQuery fromQueryMap(Map input) {
    SlaMeasurementDataFindBulkParticipantQuery retVal = new SlaMeasurementDataFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("SlaMeasurementDataFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("SlaMeasurementData");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(SlaMeasurementDataObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

