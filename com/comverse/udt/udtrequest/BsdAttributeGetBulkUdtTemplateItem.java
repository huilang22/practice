/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BsdAttributeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeObjectKeyData bsdAttributeGetIn;
/**
 *
 * Constructor to create a  BsdAttributeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectKeyData bsdAttributeGetInIn) {
    super(id, context, "BsdAttributeGet");
    bsdAttributeGetIn = bsdAttributeGetInIn;
  }

  public void translateToMap() {
    if (bsdAttributeGetIn != null) {
      bsdAttributeGetIn.resetFlags(true, true);
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(bsdAttributeGetIn, new HashMap(), "BsdAttributeObjectKeyData").get("BsdAttributeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttribute
 * @param bsdAttributeGetInIn Value of the bsdAttributeGetIn
 *
 */

  public void setBsdAttribute(BsdAttributeObjectKeyData bsdAttributeGetInIn) {
    bsdAttributeGetIn = bsdAttributeGetInIn;
  }

  public void translateFromMap() {
    bsdAttributeGetIn = BsdAttributeObjectKeyHelper.fromMap(inputMap, "BsdAttribute");
  }

/**
 *
 * Gets the BsdAttribute
 * @return Value of the BsdAttribute
 *
 */

  public BsdAttributeObjectKeyData getBsdAttribute( ) {
    return bsdAttributeGetIn;
  }

}
