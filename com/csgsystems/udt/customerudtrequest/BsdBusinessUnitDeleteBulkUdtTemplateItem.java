/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdBusinessUnitDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdBusinessUnitDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdBusinessUnitObjectKeyData bsdBusinessUnitDeleteIn;
/**
 *
 * Constructor to create a  BsdBusinessUnitDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdBusinessUnitDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectKeyData bsdBusinessUnitDeleteInIn) {
    super(id, context, "BsdBusinessUnitDelete");
    bsdBusinessUnitDeleteIn = bsdBusinessUnitDeleteInIn;
  }

  public void translateToMap() {
    if (bsdBusinessUnitDeleteIn != null) {
      bsdBusinessUnitDeleteIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(bsdBusinessUnitDeleteIn, new HashMap(), "BsdBusinessUnitObjectKeyData").get("BsdBusinessUnitObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdBusinessUnit
 * @param bsdBusinessUnitDeleteInIn Value of the bsdBusinessUnitDeleteIn
 *
 */

  public void setBsdBusinessUnit(BsdBusinessUnitObjectKeyData bsdBusinessUnitDeleteInIn) {
    bsdBusinessUnitDeleteIn = bsdBusinessUnitDeleteInIn;
  }

  public void translateFromMap() {
    bsdBusinessUnitDeleteIn = BsdBusinessUnitObjectKeyHelper.fromMap(inputMap, "BsdBusinessUnit");
  }

/**
 *
 * Gets the BsdBusinessUnit
 * @return Value of the BsdBusinessUnit
 *
 */

  public BsdBusinessUnitObjectKeyData getBsdBusinessUnit( ) {
    return bsdBusinessUnitDeleteIn;
  }

}
