package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherStatusMovementFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherStatusMovementFindBulkParticipantQuery (BSDMSessionContext context, VoucherStatusMovementObjectFilter inFilter) {
    queryName = "VoucherStatusMovementFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherStatusMovementFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherStatusMovementObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherStatusMovementObjectHelper.toMap((VoucherStatusMovementObjectFilter)filter, new HashMap(), "VoucherStatusMovement");
    }
  }
  public static VoucherStatusMovementFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherStatusMovementFindBulkParticipantQuery retVal = new VoucherStatusMovementFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherStatusMovementFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherStatusMovement");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherStatusMovementObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

