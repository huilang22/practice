package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ProductChargeMapFindBulkParticipantQuery extends BulkParticipantQuery {

  public ProductChargeMapFindBulkParticipantQuery (BSDMSessionContext context, ProductChargeMapObjectFilter inFilter) {
    queryName = "ProductChargeMapFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ProductChargeMapFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ProductChargeMapObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ProductChargeMapObjectHelper.toMap((ProductChargeMapObjectFilter)filter, new HashMap(), "ProductChargeMap");
    }
  }
  public static ProductChargeMapFindBulkParticipantQuery fromQueryMap(Map input) {
    ProductChargeMapFindBulkParticipantQuery retVal = new ProductChargeMapFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ProductChargeMapFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ProductChargeMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ProductChargeMapObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

