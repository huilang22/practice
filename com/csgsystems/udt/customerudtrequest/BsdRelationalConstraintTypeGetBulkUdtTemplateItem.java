/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeGetIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeGetInIn) {
    super(id, context, "BsdRelationalConstraintTypeGet");
    bsdRelationalConstraintTypeGetIn = bsdRelationalConstraintTypeGetInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintTypeGetIn != null) {
      bsdRelationalConstraintTypeGetIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(bsdRelationalConstraintTypeGetIn, new HashMap(), "BsdRelationalConstraintTypeObjectKeyData").get("BsdRelationalConstraintTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintType
 * @param bsdRelationalConstraintTypeGetInIn Value of the bsdRelationalConstraintTypeGetIn
 *
 */

  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeGetInIn) {
    bsdRelationalConstraintTypeGetIn = bsdRelationalConstraintTypeGetInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintTypeGetIn = BsdRelationalConstraintTypeObjectKeyHelper.fromMap(inputMap, "BsdRelationalConstraintType");
  }

/**
 *
 * Gets the BsdRelationalConstraintType
 * @return Value of the BsdRelationalConstraintType
 *
 */

  public BsdRelationalConstraintTypeObjectKeyData getBsdRelationalConstraintType( ) {
    return bsdRelationalConstraintTypeGetIn;
  }

}
