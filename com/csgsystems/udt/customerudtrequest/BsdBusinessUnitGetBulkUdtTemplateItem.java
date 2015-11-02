/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdBusinessUnitGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdBusinessUnitGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdBusinessUnitObjectKeyData bsdBusinessUnitGetIn;
/**
 *
 * Constructor to create a  BsdBusinessUnitGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdBusinessUnitGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectKeyData bsdBusinessUnitGetInIn) {
    super(id, context, "BsdBusinessUnitGet");
    bsdBusinessUnitGetIn = bsdBusinessUnitGetInIn;
  }

  public void translateToMap() {
    if (bsdBusinessUnitGetIn != null) {
      bsdBusinessUnitGetIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(bsdBusinessUnitGetIn, new HashMap(), "BsdBusinessUnitObjectKeyData").get("BsdBusinessUnitObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdBusinessUnit
 * @param bsdBusinessUnitGetInIn Value of the bsdBusinessUnitGetIn
 *
 */

  public void setBsdBusinessUnit(BsdBusinessUnitObjectKeyData bsdBusinessUnitGetInIn) {
    bsdBusinessUnitGetIn = bsdBusinessUnitGetInIn;
  }

  public void translateFromMap() {
    bsdBusinessUnitGetIn = BsdBusinessUnitObjectKeyHelper.fromMap(inputMap, "BsdBusinessUnit");
  }

/**
 *
 * Gets the BsdBusinessUnit
 * @return Value of the BsdBusinessUnit
 *
 */

  public BsdBusinessUnitObjectKeyData getBsdBusinessUnit( ) {
    return bsdBusinessUnitGetIn;
  }

}
