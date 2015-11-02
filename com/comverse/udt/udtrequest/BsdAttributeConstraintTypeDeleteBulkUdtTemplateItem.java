/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeDeleteIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeDeleteInIn) {
    super(id, context, "BsdAttributeConstraintTypeDelete");
    bsdAttributeConstraintTypeDeleteIn = bsdAttributeConstraintTypeDeleteInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintTypeDeleteIn != null) {
      bsdAttributeConstraintTypeDeleteIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(bsdAttributeConstraintTypeDeleteIn, new HashMap(), "BsdAttributeConstraintTypeObjectKeyData").get("BsdAttributeConstraintTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintType
 * @param bsdAttributeConstraintTypeDeleteInIn Value of the bsdAttributeConstraintTypeDeleteIn
 *
 */

  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeDeleteInIn) {
    bsdAttributeConstraintTypeDeleteIn = bsdAttributeConstraintTypeDeleteInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintTypeDeleteIn = BsdAttributeConstraintTypeObjectKeyHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }

/**
 *
 * Gets the BsdAttributeConstraintType
 * @return Value of the BsdAttributeConstraintType
 *
 */

  public BsdAttributeConstraintTypeObjectKeyData getBsdAttributeConstraintType( ) {
    return bsdAttributeConstraintTypeDeleteIn;
  }

}
