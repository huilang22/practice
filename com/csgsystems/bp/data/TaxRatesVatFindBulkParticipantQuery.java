package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxRatesVatFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxRatesVatFindBulkParticipantQuery (BSDMSessionContext context, TaxRatesVatObjectFilter inFilter) {
    queryName = "TaxRatesVatFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxRatesVatFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TaxRatesVatObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TaxRatesVatObjectHelper.toMap((TaxRatesVatObjectFilter)filter, new HashMap(), "TaxRatesVat");
    }
  }
  public static TaxRatesVatFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxRatesVatFindBulkParticipantQuery retVal = new TaxRatesVatFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxRatesVatFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxRatesVat");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TaxRatesVatObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

