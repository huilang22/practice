/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressUpdateInternalBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a AdrAddressUpdateInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressUpdateInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LocalAddressObjectData LocalAddressUpdateInternalIn;
/**
 *
 * Constructor to create a  AdrAddressUpdateInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressUpdateInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, LocalAddressObjectData LocalAddressUpdateInternalInIn) {
    super(id, context, "AdrAddressUpdateInternal");
    LocalAddressUpdateInternalIn = LocalAddressUpdateInternalInIn;
  }

  public void translateToMap() {
    if (LocalAddressUpdateInternalIn != null) {
      LocalAddressUpdateInternalIn.resetFlags(true, true);
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressUpdateInternalIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param LocalAddressUpdateInternalInIn Value of the LocalAddressUpdateInternalIn
 *
 */

  public void setAdrAddress(LocalAddressObjectData LocalAddressUpdateInternalInIn) {
    LocalAddressUpdateInternalIn = LocalAddressUpdateInternalInIn;
  }

  public void translateFromMap() {
    LocalAddressUpdateInternalIn = LocalAddressObjectHelper.fromMap(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public LocalAddressObjectData getAdrAddress( ) {
    return LocalAddressUpdateInternalIn;
  }

}
