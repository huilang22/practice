/*
 * Generated code DO NOT EDIT
 * Generated file: BsdActionGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdActionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdActionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdActionObjectKeyData bsdActionGetIn;
/**
 *
 * Constructor to create a  BsdActionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdActionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectKeyData bsdActionGetInIn) {
    super(id, context, "BsdActionGet");
    bsdActionGetIn = bsdActionGetInIn;
  }

  public void translateToMap() {
    if (bsdActionGetIn != null) {
      bsdActionGetIn.resetFlags(true, true);
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(bsdActionGetIn, new HashMap(), "BsdActionObjectKeyData").get("BsdActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAction
 * @param bsdActionGetInIn Value of the bsdActionGetIn
 *
 */

  public void setBsdAction(BsdActionObjectKeyData bsdActionGetInIn) {
    bsdActionGetIn = bsdActionGetInIn;
  }

  public void translateFromMap() {
    bsdActionGetIn = BsdActionObjectKeyHelper.fromMap(inputMap, "BsdAction");
  }

/**
 *
 * Gets the BsdAction
 * @return Value of the BsdAction
 *
 */

  public BsdActionObjectKeyData getBsdAction( ) {
    return bsdActionGetIn;
  }

}
