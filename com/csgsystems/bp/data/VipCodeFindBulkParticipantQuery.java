package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VipCodeFindBulkParticipantQuery extends BulkParticipantQuery {

  public VipCodeFindBulkParticipantQuery (BSDMSessionContext context, VipCodeObjectFilter inFilter) {
    queryName = "VipCodeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VipCodeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VipCodeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VipCodeObjectHelper.toMap((VipCodeObjectFilter)filter, new HashMap(), "VipCode");
    }
  }
  public static VipCodeFindBulkParticipantQuery fromQueryMap(Map input) {
    VipCodeFindBulkParticipantQuery retVal = new VipCodeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VipCodeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VipCode");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VipCodeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

