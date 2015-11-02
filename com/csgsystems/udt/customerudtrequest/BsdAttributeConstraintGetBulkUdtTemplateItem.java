/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintGetIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintGetInIn) {
    super(id, context, "BsdAttributeConstraintGet");
    bsdAttributeConstraintGetIn = bsdAttributeConstraintGetInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintGetIn != null) {
      bsdAttributeConstraintGetIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(bsdAttributeConstraintGetIn, new HashMap(), "BsdAttributeConstraintObjectBaseKeyData").get("BsdAttributeConstraintObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraint
 * @param bsdAttributeConstraintGetInIn Value of the bsdAttributeConstraintGetIn
 *
 */

  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintGetInIn) {
    bsdAttributeConstraintGetIn = bsdAttributeConstraintGetInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintGetIn = BsdAttributeConstraintObjectBaseKeyHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }

/**
 *
 * Gets the BsdAttributeConstraint
 * @return Value of the BsdAttributeConstraint
 *
 */

  public BsdAttributeConstraintObjectBaseKeyData getBsdAttributeConstraint( ) {
    return bsdAttributeConstraintGetIn;
  }

}
