/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeDefaultGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationAttributeDefaultGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationAttributeDefaultGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationAttributeDefaultObjectKeyData bsdApplicationAttributeDefaultGetIn;
/**
 *
 * Constructor to create a  BsdApplicationAttributeDefaultGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationAttributeDefaultGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationAttributeDefaultObjectKeyData bsdApplicationAttributeDefaultGetInIn) {
    super(id, context, "BsdApplicationAttributeDefaultGet");
    bsdApplicationAttributeDefaultGetIn = bsdApplicationAttributeDefaultGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationAttributeDefaultGetIn != null) {
      bsdApplicationAttributeDefaultGetIn.resetFlags(true, true);
      addInput("BsdApplicationAttributeDefault", BsdApplicationAttributeDefaultObjectKeyHelper.toMap(bsdApplicationAttributeDefaultGetIn, new HashMap(), "BsdApplicationAttributeDefaultObjectKeyData").get("BsdApplicationAttributeDefaultObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationAttributeDefault
 * @param bsdApplicationAttributeDefaultGetInIn Value of the bsdApplicationAttributeDefaultGetIn
 *
 */

  public void setBsdApplicationAttributeDefault(BsdApplicationAttributeDefaultObjectKeyData bsdApplicationAttributeDefaultGetInIn) {
    bsdApplicationAttributeDefaultGetIn = bsdApplicationAttributeDefaultGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationAttributeDefaultGetIn = BsdApplicationAttributeDefaultObjectKeyHelper.fromMap(inputMap, "BsdApplicationAttributeDefault");
  }

/**
 *
 * Gets the BsdApplicationAttributeDefault
 * @return Value of the BsdApplicationAttributeDefault
 *
 */

  public BsdApplicationAttributeDefaultObjectKeyData getBsdApplicationAttributeDefault( ) {
    return bsdApplicationAttributeDefaultGetIn;
  }

}
