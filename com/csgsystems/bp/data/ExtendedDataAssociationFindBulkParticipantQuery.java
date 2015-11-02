package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ExtendedDataAssociationFindBulkParticipantQuery extends BulkParticipantQuery {

  public ExtendedDataAssociationFindBulkParticipantQuery (BSDMSessionContext context, ExtendedDataObjectFilter inFilter) {
    queryName = "ExtendedDataAssociationFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ExtendedDataAssociationFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ExtendedDataObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ExtendedDataObjectHelper.toMap((ExtendedDataObjectFilter)filter, new HashMap(), "ExtendedDataAssociation");
    }
  }
  public static ExtendedDataAssociationFindBulkParticipantQuery fromQueryMap(Map input) {
    ExtendedDataAssociationFindBulkParticipantQuery retVal = new ExtendedDataAssociationFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ExtendedDataAssociationFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExtendedDataAssociation");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ExtendedDataObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

