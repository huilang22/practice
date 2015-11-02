/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeUpdateIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeUpdateInIn) {
    super(id, context, "BsdAttributeConstraintTypeUpdate");
    bsdAttributeConstraintTypeUpdateIn = bsdAttributeConstraintTypeUpdateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintTypeUpdateIn != null) {
      bsdAttributeConstraintTypeUpdateIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(bsdAttributeConstraintTypeUpdateIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintType
 * @param bsdAttributeConstraintTypeUpdateInIn Value of the bsdAttributeConstraintTypeUpdateIn
 *
 */

  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeUpdateInIn) {
    bsdAttributeConstraintTypeUpdateIn = bsdAttributeConstraintTypeUpdateInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintTypeUpdateIn = BsdAttributeConstraintTypeObjectHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }

/**
 *
 * Gets the BsdAttributeConstraintType
 * @return Value of the BsdAttributeConstraintType
 *
 */

  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintType( ) {
    return bsdAttributeConstraintTypeUpdateIn;
  }

}
