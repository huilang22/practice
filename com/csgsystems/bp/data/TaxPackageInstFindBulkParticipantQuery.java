package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class TaxPackageInstFindBulkParticipantQuery extends BulkParticipantQuery {

  public TaxPackageInstFindBulkParticipantQuery (BSDMSessionContext context, TPIObjectFilter inFilter) {
    queryName = "TaxPackageInstFind";
    filter = inFilter;
    this.setContext(context);
  }
  public TaxPackageInstFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(TPIObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return TPIObjectHelper.toMap((TPIObjectFilter)filter, new HashMap(), "TaxPackageInst");
    }
  }
  public static TaxPackageInstFindBulkParticipantQuery fromQueryMap(Map input) {
    TaxPackageInstFindBulkParticipantQuery retVal = new TaxPackageInstFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("TaxPackageInstFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("TaxPackageInst");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(TPIObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

