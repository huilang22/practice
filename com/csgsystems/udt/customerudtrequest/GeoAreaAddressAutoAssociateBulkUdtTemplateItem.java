/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaAddressAutoAssociateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a GeoAreaAddressAutoAssociateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaAddressAutoAssociateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger AddressId;
  protected Integer BoundaryId;
  protected Integer EnableAsync;
  protected String Email;
/**
 *
 * Constructor to create a  GeoAreaAddressAutoAssociateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaAddressAutoAssociateBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger AddressIdIn, Integer BoundaryIdIn, Integer EnableAsyncIn, String EmailIn) {
    super(id, context, "GeoAreaAddressAutoAssociate");
    AddressId = AddressIdIn;
    BoundaryId = BoundaryIdIn;
    EnableAsync = EnableAsyncIn;
    Email = EmailIn;
  }

  public void translateToMap() {
    if (AddressId != null) {
      addInput("AddressId", AddressId);
    }
    if (BoundaryId != null) {
      addInput("BoundaryId", BoundaryId);
    }
    if (EnableAsync != null) {
      addInput("EnableAsync", EnableAsync);
    }
    if (Email != null) {
      addInput("Email", Email);
    }
  }


/**
 *
 * Sets the AddressId
 * @param AddressIdIn Value of the AddressId
 *
 */

  public void setAddressId(BigInteger AddressIdIn) {
    AddressId = AddressIdIn;
  }

/**
 *
 * Sets the BoundaryId
 * @param BoundaryIdIn Value of the BoundaryId
 *
 */

  public void setBoundaryId(Integer BoundaryIdIn) {
    BoundaryId = BoundaryIdIn;
  }

/**
 *
 * Sets the EnableAsync
 * @param EnableAsyncIn Value of the EnableAsync
 *
 */

  public void setEnableAsync(Integer EnableAsyncIn) {
    EnableAsync = EnableAsyncIn;
  }

/**
 *
 * Sets the Email
 * @param EmailIn Value of the Email
 *
 */

  public void setEmail(String EmailIn) {
    Email = EmailIn;
  }

  public void translateFromMap() {
    AddressId = (BigInteger)inputMap.get("AddressId");
    BoundaryId = (Integer)inputMap.get("BoundaryId");
    EnableAsync = (Integer)inputMap.get("EnableAsync");
    Email = (String)inputMap.get("Email");
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return AddressId;
  }

/**
 *
 * Gets the BoundaryId
 * @return Value of the BoundaryId
 *
 */

  public Integer getBoundaryId( ) {
    return BoundaryId;
  }

/**
 *
 * Gets the EnableAsync
 * @return Value of the EnableAsync
 *
 */

  public Integer getEnableAsync( ) {
    return EnableAsync;
  }

/**
 *
 * Gets the Email
 * @return Value of the Email
 *
 */

  public String getEmail( ) {
    return Email;
  }

}
