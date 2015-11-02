package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class AccountLocateFindByAddressIdBulkParticipantQuery extends BulkParticipantQuery {

  public AccountLocateFindByAddressIdBulkParticipantQuery (BSDMSessionContext context, AddressLocateXIDObjectFilter inFilter) {
    queryName = "AccountLocateFindByAddressId";
    filter = inFilter;
    this.setContext(context);
  }
  public AccountLocateFindByAddressIdBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(AddressLocateXIDObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return AddressLocateXIDObjectHelper.toMap((AddressLocateXIDObjectFilter)filter, new HashMap(), "AlafIn");
    }
  }
  public static AccountLocateFindByAddressIdBulkParticipantQuery fromQueryMap(Map input) {
    AccountLocateFindByAddressIdBulkParticipantQuery retVal = new AccountLocateFindByAddressIdBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("AccountLocateFindByAddressId");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("AlafIn");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(AddressLocateXIDObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

