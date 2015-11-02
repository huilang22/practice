package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountLocateFindByServiceExtendeddataBulkParticipantQuery extends BulkParticipantQuery {

  public AccountLocateFindByServiceExtendeddataBulkParticipantQuery (BSDMSessionContext context, ServiceExtendedDataLocateXIDObjectFilter inFilter) {
    queryName = "AccountLocateFindByServiceExtendeddata";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountLocateFindByServiceExtendeddataBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServiceExtendedDataLocateXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServiceExtendedDataLocateXIDObjectHelper.toMap((ServiceExtendedDataLocateXIDObjectFilter)filter, new HashMap(), "AlsedfIn");
    }
  }
  public static AccountLocateFindByServiceExtendeddataBulkParticipantQuery fromQueryMap(Map input) {
    AccountLocateFindByServiceExtendeddataBulkParticipantQuery retVal = new AccountLocateFindByServiceExtendeddataBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountLocateFindByServiceExtendeddata");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AlsedfIn");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServiceExtendedDataLocateXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

