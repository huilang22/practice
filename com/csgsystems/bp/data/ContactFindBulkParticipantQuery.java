package com.csgsystems.bp.data;

import java.util.HashMap;
import java.util.Map;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.bulk.BulkParticipantQuery;

public class ContactFindBulkParticipantQuery extends BulkParticipantQuery {

  public ContactFindBulkParticipantQuery (BSDMSessionContext context, ContactObjectFilter inFilter) {
    queryName = "ContactFind";
    filter = inFilter;
    this.setContext(context);
  }
  public ContactFindBulkParticipantQuery () {
    this (null, null);
  }
  public void setFilter(ContactObjectFilter inFilter) {
    filter = inFilter;
  }
  public Map getFilterMap() {
    if (filter == null) {
      return null;
    } else {
      return ContactObjectHelper.toMap((ContactObjectFilter)filter, new HashMap(), "Contact");
    }
  }
  public static ContactFindBulkParticipantQuery fromQueryMap(Map input) {
    ContactFindBulkParticipantQuery retVal = new ContactFindBulkParticipantQuery();
    retVal.setContext(BSDMSessionContext.fromMap(input));
    Map methodMap = (Map)input.get("ContactFind");
    if (methodMap != null) {
      Map filterMap = (Map) methodMap.get("Contact");
      Integer index = (Integer)methodMap.get("Index");
      if (filterMap != null) {
        retVal.setFilter(ContactObjectHelper.getFilter(filterMap));
      }
      if (retVal.getFilter() != null && index != null) {
        retVal.getFilter().setIndex(index);
      }
    }
    return retVal;
  }
}

