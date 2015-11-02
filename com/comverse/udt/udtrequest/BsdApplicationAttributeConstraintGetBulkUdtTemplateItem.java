/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationAttributeConstraintGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationAttributeConstraintGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationAttributeConstraintObjectKeyData bsdApplicationAttributeConstraintGetIn;
/**
 *
 * Constructor to create a  BsdApplicationAttributeConstraintGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationAttributeConstraintGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationAttributeConstraintObjectKeyData bsdApplicationAttributeConstraintGetInIn) {
    super(id, context, "BsdApplicationAttributeConstraintGet");
    bsdApplicationAttributeConstraintGetIn = bsdApplicationAttributeConstraintGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationAttributeConstraintGetIn != null) {
      bsdApplicationAttributeConstraintGetIn.resetFlags(true, true);
      addInput("BsdApplicationAttributeConstraint", BsdApplicationAttributeConstraintObjectKeyHelper.toMap(bsdApplicationAttributeConstraintGetIn, new HashMap(), "BsdApplicationAttributeConstraintObjectKeyData").get("BsdApplicationAttributeConstraintObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationAttributeConstraint
 * @param bsdApplicationAttributeConstraintGetInIn Value of the bsdApplicationAttributeConstraintGetIn
 *
 */

  public void setBsdApplicationAttributeConstraint(BsdApplicationAttributeConstraintObjectKeyData bsdApplicationAttributeConstraintGetInIn) {
    bsdApplicationAttributeConstraintGetIn = bsdApplicationAttributeConstraintGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationAttributeConstraintGetIn = BsdApplicationAttributeConstraintObjectKeyHelper.fromMap(inputMap, "BsdApplicationAttributeConstraint");
  }

/**
 *
 * Gets the BsdApplicationAttributeConstraint
 * @return Value of the BsdApplicationAttributeConstraint
 *
 */

  public BsdApplicationAttributeConstraintObjectKeyData getBsdApplicationAttributeConstraint( ) {
    return bsdApplicationAttributeConstraintGetIn;
  }

}
