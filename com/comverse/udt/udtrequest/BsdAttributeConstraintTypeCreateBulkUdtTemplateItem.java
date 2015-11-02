/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeCreateIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeCreateInIn) {
    super(id, context, "BsdAttributeConstraintTypeCreate");
    bsdAttributeConstraintTypeCreateIn = bsdAttributeConstraintTypeCreateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintTypeCreateIn != null) {
      bsdAttributeConstraintTypeCreateIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(bsdAttributeConstraintTypeCreateIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintType
 * @param bsdAttributeConstraintTypeCreateInIn Value of the bsdAttributeConstraintTypeCreateIn
 *
 */

  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeCreateInIn) {
    bsdAttributeConstraintTypeCreateIn = bsdAttributeConstraintTypeCreateInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintTypeCreateIn = BsdAttributeConstraintTypeObjectHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }

/**
 *
 * Gets the BsdAttributeConstraintType
 * @return Value of the BsdAttributeConstraintType
 *
 */

  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintType( ) {
    return bsdAttributeConstraintTypeCreateIn;
  }

}
