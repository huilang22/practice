package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherLocationFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherLocationFindBulkParticipantQuery (BSDMSessionContext context, VoucherLocationObjectFilter inFilter) {
    queryName = "VoucherLocationFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherLocationFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherLocationObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherLocationObjectHelper.toMap((VoucherLocationObjectFilter)filter, new HashMap(), "VoucherLocation");
    }
  }
  public static VoucherLocationFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherLocationFindBulkParticipantQuery retVal = new VoucherLocationFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherLocationFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherLocation");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherLocationObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

