package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ProductRateOverrideFindBulkParticipantQuery extends BulkParticipantQuery {

  public ProductRateOverrideFindBulkParticipantQuery (BSDMSessionContext context, ProductRateOverrideObjectFilter inFilter) {
    queryName = "ProductRateOverrideFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ProductRateOverrideFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ProductRateOverrideObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ProductRateOverrideObjectHelper.toMap((ProductRateOverrideObjectFilter)filter, new HashMap(), "ProductRateOverride");
    }
  }
  public static ProductRateOverrideFindBulkParticipantQuery fromQueryMap(Map input) {
    ProductRateOverrideFindBulkParticipantQuery retVal = new ProductRateOverrideFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ProductRateOverrideFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ProductRateOverride");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ProductRateOverrideObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

