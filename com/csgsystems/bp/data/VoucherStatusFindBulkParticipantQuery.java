package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherStatusFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherStatusFindBulkParticipantQuery (BSDMSessionContext context, VoucherStatusObjectFilter inFilter) {
    queryName = "VoucherStatusFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherStatusFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherStatusObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherStatusObjectHelper.toMap((VoucherStatusObjectFilter)filter, new HashMap(), "VoucherStatus");
    }
  }
  public static VoucherStatusFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherStatusFindBulkParticipantQuery retVal = new VoucherStatusFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherStatusFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherStatus");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherStatusObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

