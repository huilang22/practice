package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherHistoryFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherHistoryFindBulkParticipantQuery (BSDMSessionContext context, VoucherHistoryObjectFilter inFilter) {
    queryName = "VoucherHistoryFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherHistoryFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherHistoryObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherHistoryObjectHelper.toMap((VoucherHistoryObjectFilter)filter, new HashMap(), "VoucherHistory");
    }
  }
  public static VoucherHistoryFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherHistoryFindBulkParticipantQuery retVal = new VoucherHistoryFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherHistoryFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherHistory");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherHistoryObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

