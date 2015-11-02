/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeDefaultUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDefaultUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeDefaultObjectBaseData bsdAttributeDefaultUpdateIn;
/**
 *
 * Constructor to create a  BsdAttributeDefaultUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDefaultUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectBaseData bsdAttributeDefaultUpdateInIn) {
    super(id, context, "BsdAttributeDefaultUpdate");
    bsdAttributeDefaultUpdateIn = bsdAttributeDefaultUpdateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeDefaultUpdateIn != null) {
      bsdAttributeDefaultUpdateIn.resetFlags(true, true);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(bsdAttributeDefaultUpdateIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }


/**
 *
 * Sets the BsdAttributeDefault
 * @param bsdAttributeDefaultUpdateInIn Value of the bsdAttributeDefaultUpdateIn
 *
 */

  public void setBsdAttributeDefault(BsdAttributeDefaultObjectBaseData bsdAttributeDefaultUpdateInIn) {
    bsdAttributeDefaultUpdateIn = bsdAttributeDefaultUpdateInIn;
  }

  public void translateFromMap() {
    bsdAttributeDefaultUpdateIn = BsdAttributeDefaultObjectBaseHelper.fromMap(inputMap, "BsdAttributeDefault");
  }

/**
 *
 * Gets the BsdAttributeDefault
 * @return Value of the BsdAttributeDefault
 *
 */

  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefault( ) {
    return bsdAttributeDefaultUpdateIn;
  }

}
