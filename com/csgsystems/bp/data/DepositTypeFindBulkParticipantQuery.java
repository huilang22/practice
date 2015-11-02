package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class DepositTypeFindBulkParticipantQuery extends BulkParticipantQuery {

  public DepositTypeFindBulkParticipantQuery (BSDMSessionContext context, DepositTypeObjectFilter inFilter) {
    queryName = "DepositTypeFind";
    filter = inFilter;
    this.setContext(context);
  }
  public DepositTypeFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(DepositTypeObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return DepositTypeObjectHelper.toMap((DepositTypeObjectFilter)filter, new HashMap(), "DepositType");
    }
  }
  public static DepositTypeFindBulkParticipantQuery fromQueryMap(Map input) {
    DepositTypeFindBulkParticipantQuery retVal = new DepositTypeFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("DepositTypeFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("DepositType");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(DepositTypeObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

