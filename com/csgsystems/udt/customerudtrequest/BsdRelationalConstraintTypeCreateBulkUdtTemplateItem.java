/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeCreateIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeCreateInIn) {
    super(id, context, "BsdRelationalConstraintTypeCreate");
    bsdRelationalConstraintTypeCreateIn = bsdRelationalConstraintTypeCreateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintTypeCreateIn != null) {
      bsdRelationalConstraintTypeCreateIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(bsdRelationalConstraintTypeCreateIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintType
 * @param bsdRelationalConstraintTypeCreateInIn Value of the bsdRelationalConstraintTypeCreateIn
 *
 */

  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeCreateInIn) {
    bsdRelationalConstraintTypeCreateIn = bsdRelationalConstraintTypeCreateInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintTypeCreateIn = BsdRelationalConstraintTypeObjectHelper.fromMap(inputMap, "BsdRelationalConstraintType");
  }

/**
 *
 * Gets the BsdRelationalConstraintType
 * @return Value of the BsdRelationalConstraintType
 *
 */

  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintType( ) {
    return bsdRelationalConstraintTypeCreateIn;
  }

}
