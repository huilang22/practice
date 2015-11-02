/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a AdrAddressExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdrAddressObjectKeyData aedfIn;
/**
 *
 * Constructor to create a  AdrAddressExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressObjectKeyData aedfInIn) {
    super(id, context, "AdrAddressExtendedDataFind");
    aedfIn = aedfInIn;
  }

  public void translateToMap() {
    if (aedfIn != null) {
      aedfIn.resetFlags(true, true);
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(aedfIn, new HashMap(), "AdrAddressObjectKeyData").get("AdrAddressObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param aedfInIn Value of the aedfIn
 *
 */

  public void setAdrAddress(AdrAddressObjectKeyData aedfInIn) {
    aedfIn = aedfInIn;
  }

  public void translateFromMap() {
    aedfIn = AdrAddressObjectKeyHelper.fromMap(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public AdrAddressObjectKeyData getAdrAddress( ) {
    return aedfIn;
  }

}
