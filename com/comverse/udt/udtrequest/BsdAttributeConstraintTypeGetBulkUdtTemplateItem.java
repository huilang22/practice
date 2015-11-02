/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeGetIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeGetInIn) {
    super(id, context, "BsdAttributeConstraintTypeGet");
    bsdAttributeConstraintTypeGetIn = bsdAttributeConstraintTypeGetInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintTypeGetIn != null) {
      bsdAttributeConstraintTypeGetIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(bsdAttributeConstraintTypeGetIn, new HashMap(), "BsdAttributeConstraintTypeObjectKeyData").get("BsdAttributeConstraintTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintType
 * @param bsdAttributeConstraintTypeGetInIn Value of the bsdAttributeConstraintTypeGetIn
 *
 */

  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeGetInIn) {
    bsdAttributeConstraintTypeGetIn = bsdAttributeConstraintTypeGetInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintTypeGetIn = BsdAttributeConstraintTypeObjectKeyHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }

/**
 *
 * Gets the BsdAttributeConstraintType
 * @return Value of the BsdAttributeConstraintType
 *
 */

  public BsdAttributeConstraintTypeObjectKeyData getBsdAttributeConstraintType( ) {
    return bsdAttributeConstraintTypeGetIn;
  }

}
