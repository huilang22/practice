/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BsdRelationalConstraintTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeUpdateIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeUpdateInIn) {
    super(id, context, "BsdRelationalConstraintTypeUpdate");
    bsdRelationalConstraintTypeUpdateIn = bsdRelationalConstraintTypeUpdateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintTypeUpdateIn != null) {
      bsdRelationalConstraintTypeUpdateIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(bsdRelationalConstraintTypeUpdateIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintType
 * @param bsdRelationalConstraintTypeUpdateInIn Value of the bsdRelationalConstraintTypeUpdateIn
 *
 */

  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeUpdateInIn) {
    bsdRelationalConstraintTypeUpdateIn = bsdRelationalConstraintTypeUpdateInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintTypeUpdateIn = BsdRelationalConstraintTypeObjectHelper.fromMap(inputMap, "BsdRelationalConstraintType");
  }

/**
 *
 * Gets the BsdRelationalConstraintType
 * @return Value of the BsdRelationalConstraintType
 *
 */

  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintType( ) {
    return bsdRelationalConstraintTypeUpdateIn;
  }

}
