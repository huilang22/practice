package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class PackageComponentDefFindBulkParticipantQuery extends BulkParticipantQuery {

  public PackageComponentDefFindBulkParticipantQuery (BSDMSessionContext context, PCDObjectFilter inFilter) {
    queryName = "PackageComponentDefFind";
    filter = inFilter;
    this.setContext(context);
  }
  public PackageComponentDefFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(PCDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return PCDObjectHelper.toMap((PCDObjectFilter)filter, new HashMap(), "PackageComponentDef");
    }
  }
  public static PackageComponentDefFindBulkParticipantQuery fromQueryMap(Map input) {
    PackageComponentDefFindBulkParticipantQuery retVal = new PackageComponentDefFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("PackageComponentDefFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("PackageComponentDef");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(PCDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

