/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationConstraintDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationConstraintDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationConstraintObjectKeyData bsdApplicationConstraintDeleteIn;
/**
 *
 * Constructor to create a  BsdApplicationConstraintDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationConstraintDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectKeyData bsdApplicationConstraintDeleteInIn) {
    super(id, context, "BsdApplicationConstraintDelete");
    bsdApplicationConstraintDeleteIn = bsdApplicationConstraintDeleteInIn;
  }

  public void translateToMap() {
    if (bsdApplicationConstraintDeleteIn != null) {
      bsdApplicationConstraintDeleteIn.resetFlags(true, true);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(bsdApplicationConstraintDeleteIn, new HashMap(), "BsdApplicationConstraintObjectKeyData").get("BsdApplicationConstraintObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationConstraint
 * @param bsdApplicationConstraintDeleteInIn Value of the bsdApplicationConstraintDeleteIn
 *
 */

  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectKeyData bsdApplicationConstraintDeleteInIn) {
    bsdApplicationConstraintDeleteIn = bsdApplicationConstraintDeleteInIn;
  }

  public void translateFromMap() {
    bsdApplicationConstraintDeleteIn = BsdApplicationConstraintObjectKeyHelper.fromMap(inputMap, "BsdApplicationConstraint");
  }

/**
 *
 * Gets the BsdApplicationConstraint
 * @return Value of the BsdApplicationConstraint
 *
 */

  public BsdApplicationConstraintObjectKeyData getBsdApplicationConstraint( ) {
    return bsdApplicationConstraintDeleteIn;
  }

}
