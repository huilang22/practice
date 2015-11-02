package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class EftTransactionFindBulkParticipantQuery extends BulkParticipantQuery {

  public EftTransactionFindBulkParticipantQuery (BSDMSessionContext context, EftTransactionObjectFilter inFilter) {
    queryName = "EftTransactionFind";
    filter = inFilter;
    this.setContext(context);
  }
  public EftTransactionFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(EftTransactionObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return EftTransactionObjectHelper.toMap((EftTransactionObjectFilter)filter, new HashMap(), "EftTransaction");
    }
  }
  public static EftTransactionFindBulkParticipantQuery fromQueryMap(Map input) {
    EftTransactionFindBulkParticipantQuery retVal = new EftTransactionFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("EftTransactionFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("EftTransaction");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(EftTransactionObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

