/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AdrAddressUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LocalAddressObjectData LocalAddressUpdateIn;
/**
 *
 * Constructor to create a  AdrAddressUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, LocalAddressObjectData LocalAddressUpdateInIn) {
    super(id, context, "AdrAddressUpdate");
    LocalAddressUpdateIn = LocalAddressUpdateInIn;
  }

  public void translateToMap() {
    if (LocalAddressUpdateIn != null) {
      LocalAddressUpdateIn.resetFlags(true, true);
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressUpdateIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param LocalAddressUpdateInIn Value of the LocalAddressUpdateIn
 *
 */

  public void setAdrAddress(LocalAddressObjectData LocalAddressUpdateInIn) {
    LocalAddressUpdateIn = LocalAddressUpdateInIn;
  }

  public void translateFromMap() {
    LocalAddressUpdateIn = LocalAddressObjectHelper.fromMap(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public LocalAddressObjectData getAdrAddress( ) {
    return LocalAddressUpdateIn;
  }

}
