package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class VoucherDefinitionsFindBulkParticipantQuery extends BulkParticipantQuery {

  public VoucherDefinitionsFindBulkParticipantQuery (BSDMSessionContext context, VoucherDefinitionsObjectFilter inFilter) {
    queryName = "VoucherDefinitionsFind";
    filter = inFilter;
    this.setContext(context);
  }
  public VoucherDefinitionsFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(VoucherDefinitionsObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return VoucherDefinitionsObjectHelper.toMap((VoucherDefinitionsObjectFilter)filter, new HashMap(), "VoucherDefinitions");
    }
  }
  public static VoucherDefinitionsFindBulkParticipantQuery fromQueryMap(Map input) {
    VoucherDefinitionsFindBulkParticipantQuery retVal = new VoucherDefinitionsFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("VoucherDefinitionsFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("VoucherDefinitions");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(VoucherDefinitionsObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

