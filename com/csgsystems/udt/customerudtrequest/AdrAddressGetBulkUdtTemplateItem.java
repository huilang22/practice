/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressGetBulkUdtTemplateItem.java
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
 * Class used to create a AdrAddressGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdrAddressObjectKeyData AdrAddressGetIn;
/**
 *
 * Constructor to create a  AdrAddressGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressObjectKeyData AdrAddressGetInIn) {
    super(id, context, "AdrAddressGet");
    AdrAddressGetIn = AdrAddressGetInIn;
  }

  public void translateToMap() {
    if (AdrAddressGetIn != null) {
      AdrAddressGetIn.resetFlags(true, true);
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(AdrAddressGetIn, new HashMap(), "AdrAddressObjectKeyData").get("AdrAddressObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param AdrAddressGetInIn Value of the AdrAddressGetIn
 *
 */

  public void setAdrAddress(AdrAddressObjectKeyData AdrAddressGetInIn) {
    AdrAddressGetIn = AdrAddressGetInIn;
  }

  public void translateFromMap() {
    AdrAddressGetIn = AdrAddressObjectKeyHelper.fromMap(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public AdrAddressObjectKeyData getAdrAddress( ) {
    return AdrAddressGetIn;
  }

}
