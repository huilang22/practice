/*
 * Generated code DO NOT EDIT
 * Generated file: ContactRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
public final class ContactRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ContactRequest (String request, ContactRequestMethod method) {
    initialize(request, "Contact", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ContactRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(RefundRequest request, ContactRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(RefundRequest request, ContactRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setContactForContactCreate(ContactObjectData data) {
    if (data != null) {
      addInput("Contact", ContactObjectHelper.toMap(data, new HashMap(), "Contact").get("Contact"));
    }
  }
  public void setContactForContactFind(ContactObjectFilter data) {
    if (data != null) {
      addInput("Contact", ContactObjectHelper.toMap(data, new HashMap(), "Contact").get("Contact"));
    }
  }
  public void setContactForContactGet(ContactObjectKeyData data) {
    if (data != null) {
      addInput("Contact", ContactObjectKeyHelper.toMap(data, new HashMap(), "Contact").get("Contact"));
    }
  }
  public void setContactForContactUpdate(ContactObjectData data) {
    if (data != null) {
      addInput("Contact", ContactObjectHelper.toMap(data, new HashMap(), "Contact").get("Contact"));
    }
  }
  public ContactObjectData getContactObjectDataContactFromContactCreate() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
  public ContactObjectDataList getContactObjectDataContactFromContactFind() {
    return ContactObjectHelper.fromMapList(outputMap, "ContactList");
  }
  public ContactObjectData getContactObjectDataContactFromContactGet() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
  public ContactObjectData getContactObjectDataContactFromContactUpdate() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
  /**
   @deprecated
   */
  public void setContactObjectFilter(ContactObjectFilter data) {
    if (data != null) {
      addInput("Contact", ContactObjectHelper.toMap(data, new HashMap()).get("ContactObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContactObjectData(ContactObjectData data) {
    if (data != null) {
      addInput("Contact", ContactObjectHelper.toMap(data, new HashMap()).get("ContactObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContactObjectKeyData(ContactObjectKeyData data) {
    if (data != null) {
      addInput("Contact", ContactObjectKeyHelper.toMap(data, new HashMap()).get("ContactObject"));
    }
  }
  /**
   @deprecated
   */
  public ContactObjectDataList getContactObjectDataList() {
    return ContactObjectHelper.fromMapList(outputMap, "ContactList");
  }
  /**
   @deprecated
   */
  public ContactObjectData getContactObjectData() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
}
