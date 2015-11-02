package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherStatusInfoFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherStatusInfoFindBulkParticipantQuery (BSDMSessionContext context, VoucherStatusInfoObjectFilter inFilter) {
    queryName = "VoucherStatusInfoFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherStatusInfoFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherStatusInfoObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherStatusInfoObjectHelper.toMap((VoucherStatusInfoObjectFilter)filter, new HashMap(), "VoucherStatusInfo");
    }
  }
  public static VoucherStatusInfoFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherStatusInfoFindBulkParticipantQuery retVal = new VoucherStatusInfoFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherStatusInfoFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherStatusInfo");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherStatusInfoObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

