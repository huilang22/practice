/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeObjectData bsdAttributeCreateIn;
/**
 *
 * Constructor to create a  BsdAttributeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectData bsdAttributeCreateInIn) {
    super(id, context, "BsdAttributeCreate");
    bsdAttributeCreateIn = bsdAttributeCreateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeCreateIn != null) {
      bsdAttributeCreateIn.resetFlags(true, true);
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(bsdAttributeCreateIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }


/**
 *
 * Sets the BsdAttribute
 * @param bsdAttributeCreateInIn Value of the bsdAttributeCreateIn
 *
 */

  public void setBsdAttribute(BsdAttributeObjectData bsdAttributeCreateInIn) {
    bsdAttributeCreateIn = bsdAttributeCreateInIn;
  }

  public void translateFromMap() {
    bsdAttributeCreateIn = BsdAttributeObjectHelper.fromMap(inputMap, "BsdAttribute");
  }

/**
 *
 * Gets the BsdAttribute
 * @return Value of the BsdAttribute
 *
 */

  public BsdAttributeObjectData getBsdAttribute( ) {
    return bsdAttributeCreateIn;
  }

}
