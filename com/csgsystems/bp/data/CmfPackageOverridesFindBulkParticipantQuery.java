package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class CmfPackageOverridesFindBulkParticipantQuery extends BulkParticipantQuery {

  public CmfPackageOverridesFindBulkParticipantQuery (BSDMSessionContext context, PackageOverridesObjectFilter inFilter) {
    queryName = "CmfPackageOverridesFind";
    filter = inFilter;
    this.setContext(context);
  }
  public CmfPackageOverridesFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PackageOverridesObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PackageOverridesObjectHelper.toMap((PackageOverridesObjectFilter)filter, new HashMap(), "CmfPackageOverrides");
    }
  }
  public static CmfPackageOverridesFindBulkParticipantQuery fromQueryMap(Map input) {
    CmfPackageOverridesFindBulkParticipantQuery retVal = new CmfPackageOverridesFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("CmfPackageOverridesFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("CmfPackageOverrides");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PackageOverridesObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

