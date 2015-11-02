/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeDefaultCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDefaultCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeDefaultObjectBaseData bsdAttributeDefaultCreateIn;
/**
 *
 * Constructor to create a  BsdAttributeDefaultCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDefaultCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectBaseData bsdAttributeDefaultCreateInIn) {
    super(id, context, "BsdAttributeDefaultCreate");
    bsdAttributeDefaultCreateIn = bsdAttributeDefaultCreateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeDefaultCreateIn != null) {
      bsdAttributeDefaultCreateIn.resetFlags(true, true);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(bsdAttributeDefaultCreateIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }


/**
 *
 * Sets the BsdAttributeDefault
 * @param bsdAttributeDefaultCreateInIn Value of the bsdAttributeDefaultCreateIn
 *
 */

  public void setBsdAttributeDefault(BsdAttributeDefaultObjectBaseData bsdAttributeDefaultCreateInIn) {
    bsdAttributeDefaultCreateIn = bsdAttributeDefaultCreateInIn;
  }

  public void translateFromMap() {
    bsdAttributeDefaultCreateIn = BsdAttributeDefaultObjectBaseHelper.fromMap(inputMap, "BsdAttributeDefault");
  }

/**
 *
 * Gets the BsdAttributeDefault
 * @return Value of the BsdAttributeDefault
 *
 */

  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefault( ) {
    return bsdAttributeDefaultCreateIn;
  }

}
