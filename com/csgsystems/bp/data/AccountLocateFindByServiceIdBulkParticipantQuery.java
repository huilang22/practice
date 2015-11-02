package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountLocateFindByServiceIdBulkParticipantQuery extends BulkParticipantQuery {

  public AccountLocateFindByServiceIdBulkParticipantQuery (BSDMSessionContext context, ServiceLocateXIDObjectFilter inFilter) {
    queryName = "AccountLocateFindByServiceId";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountLocateFindByServiceIdBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ServiceLocateXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ServiceLocateXIDObjectHelper.toMap((ServiceLocateXIDObjectFilter)filter, new HashMap(), "ExternalIdEquipMap");
    }
  }
  public static AccountLocateFindByServiceIdBulkParticipantQuery fromQueryMap(Map input) {
    AccountLocateFindByServiceIdBulkParticipantQuery retVal = new AccountLocateFindByServiceIdBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountLocateFindByServiceId");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("ExternalIdEquipMap");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ServiceLocateXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

