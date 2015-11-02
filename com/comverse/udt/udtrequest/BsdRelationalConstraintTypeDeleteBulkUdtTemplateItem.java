/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeDeleteIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeDeleteInIn) {
    super(id, context, "BsdRelationalConstraintTypeDelete");
    bsdRelationalConstraintTypeDeleteIn = bsdRelationalConstraintTypeDeleteInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintTypeDeleteIn != null) {
      bsdRelationalConstraintTypeDeleteIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(bsdRelationalConstraintTypeDeleteIn, new HashMap(), "BsdRelationalConstraintTypeObjectKeyData").get("BsdRelationalConstraintTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintType
 * @param bsdRelationalConstraintTypeDeleteInIn Value of the bsdRelationalConstraintTypeDeleteIn
 *
 */

  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeDeleteInIn) {
    bsdRelationalConstraintTypeDeleteIn = bsdRelationalConstraintTypeDeleteInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintTypeDeleteIn = BsdRelationalConstraintTypeObjectKeyHelper.fromMap(inputMap, "BsdRelationalConstraintType");
  }

/**
 *
 * Gets the BsdRelationalConstraintType
 * @return Value of the BsdRelationalConstraintType
 *
 */

  public BsdRelationalConstraintTypeObjectKeyData getBsdRelationalConstraintType( ) {
    return bsdRelationalConstraintTypeDeleteIn;
  }

}
