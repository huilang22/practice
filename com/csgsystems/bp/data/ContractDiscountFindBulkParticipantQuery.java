package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ContractDiscountFindBulkParticipantQuery extends BulkParticipantQuery {

  public ContractDiscountFindBulkParticipantQuery (BSDMSessionContext context, ContractDiscountObjectFilter inFilter) {
    queryName = "ContractDiscountFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ContractDiscountFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ContractDiscountObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ContractDiscountObjectHelper.toMap((ContractDiscountObjectFilter)filter, new HashMap(), "ContractDiscount");
    }
  }
  public static ContractDiscountFindBulkParticipantQuery fromQueryMap(Map input) {
    ContractDiscountFindBulkParticipantQuery retVal = new ContractDiscountFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ContractDiscountFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ContractDiscount");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ContractDiscountObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

