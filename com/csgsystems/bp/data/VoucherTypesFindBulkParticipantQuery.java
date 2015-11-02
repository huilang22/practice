package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherTypesFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherTypesFindBulkParticipantQuery (BSDMSessionContext context, VoucherTypesObjectFilter inFilter) {
    queryName = "VoucherTypesFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherTypesFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherTypesObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherTypesObjectHelper.toMap((VoucherTypesObjectFilter)filter, new HashMap(), "VoucherTypes");
    }
  }
  public static VoucherTypesFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherTypesFindBulkParticipantQuery retVal = new VoucherTypesFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherTypesFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherTypes");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherTypesObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

