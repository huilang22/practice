/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressCreateBulkUdtTemplateItem.java
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
 * Class used to create a AdrAddressCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LocalAddressObjectData LocalAddressCreateIn;
/**
 *
 * Constructor to create a  AdrAddressCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, LocalAddressObjectData LocalAddressCreateInIn) {
    super(id, context, "AdrAddressCreate");
    LocalAddressCreateIn = LocalAddressCreateInIn;
  }

  public void translateToMap() {
    if (LocalAddressCreateIn != null) {
      LocalAddressCreateIn.resetFlags(true, true);
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressCreateIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param LocalAddressCreateInIn Value of the LocalAddressCreateIn
 *
 */

  public void setAdrAddress(LocalAddressObjectData LocalAddressCreateInIn) {
    LocalAddressCreateIn = LocalAddressCreateInIn;
  }

  public void translateFromMap() {
    LocalAddressCreateIn = LocalAddressObjectHelper.fromMap(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public LocalAddressObjectData getAdrAddress( ) {
    return LocalAddressCreateIn;
  }

}
