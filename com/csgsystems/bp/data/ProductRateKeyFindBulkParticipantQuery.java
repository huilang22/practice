package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ProductRateKeyFindBulkParticipantQuery extends BulkParticipantQuery {

  public ProductRateKeyFindBulkParticipantQuery (BSDMSessionContext context, ProductRateKeyObjectFilter inFilter) {
    queryName = "ProductRateKeyFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ProductRateKeyFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ProductRateKeyObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ProductRateKeyObjectHelper.toMap((ProductRateKeyObjectFilter)filter, new HashMap(), "ProductRateKey");
    }
  }
  public static ProductRateKeyFindBulkParticipantQuery fromQueryMap(Map input) {
    ProductRateKeyFindBulkParticipantQuery retVal = new ProductRateKeyFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ProductRateKeyFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ProductRateKey");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ProductRateKeyObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

