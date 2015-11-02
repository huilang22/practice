/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationConstraintGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationConstraintGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationConstraintObjectKeyData bsdApplicationConstraintGetIn;
/**
 *
 * Constructor to create a  BsdApplicationConstraintGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationConstraintGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectKeyData bsdApplicationConstraintGetInIn) {
    super(id, context, "BsdApplicationConstraintGet");
    bsdApplicationConstraintGetIn = bsdApplicationConstraintGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationConstraintGetIn != null) {
      bsdApplicationConstraintGetIn.resetFlags(true, true);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(bsdApplicationConstraintGetIn, new HashMap(), "BsdApplicationConstraintObjectKeyData").get("BsdApplicationConstraintObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationConstraint
 * @param bsdApplicationConstraintGetInIn Value of the bsdApplicationConstraintGetIn
 *
 */

  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectKeyData bsdApplicationConstraintGetInIn) {
    bsdApplicationConstraintGetIn = bsdApplicationConstraintGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationConstraintGetIn = BsdApplicationConstraintObjectKeyHelper.fromMap(inputMap, "BsdApplicationConstraint");
  }

/**
 *
 * Gets the BsdApplicationConstraint
 * @return Value of the BsdApplicationConstraint
 *
 */

  public BsdApplicationConstraintObjectKeyData getBsdApplicationConstraint( ) {
    return bsdApplicationConstraintGetIn;
  }

}
