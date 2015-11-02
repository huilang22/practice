package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExchangeRateClassFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExchangeRateClassFindBulkParticipantQuery (BSDMSessionContext context, ExchangeRateClassObjectFilter inFilter) {
    queryName = "ExchangeRateClassFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExchangeRateClassFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ExchangeRateClassObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ExchangeRateClassObjectHelper.toMap((ExchangeRateClassObjectFilter)filter, new HashMap(), "ExchangeRateClass");
    }
  }
  public static ExchangeRateClassFindBulkParticipantQuery fromQueryMap(Map input) {
    ExchangeRateClassFindBulkParticipantQuery retVal = new ExchangeRateClassFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExchangeRateClassFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExchangeRateClass");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ExchangeRateClassObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

