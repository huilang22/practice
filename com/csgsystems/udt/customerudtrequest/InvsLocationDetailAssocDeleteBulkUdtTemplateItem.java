/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsLocationDetailAssocDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailAssocDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailAssocObjectData InvsLocationDetailAssocDeleteIn;
/**
 *
 * Constructor to create a  InvsLocationDetailAssocDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailAssocDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailAssocObjectData InvsLocationDetailAssocDeleteInIn) {
    super(id, context, "InvsLocationDetailAssocDelete");
    InvsLocationDetailAssocDeleteIn = InvsLocationDetailAssocDeleteInIn;
  }

  public void translateToMap() {
    if (InvsLocationDetailAssocDeleteIn != null) {
      InvsLocationDetailAssocDeleteIn.resetFlags(true, true);
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(InvsLocationDetailAssocDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvsLocationDetailAssoc
 * @param InvsLocationDetailAssocDeleteInIn Value of the InvsLocationDetailAssocDeleteIn
 *
 */

  public void setInvsLocationDetailAssoc(InvsLocationDetailAssocObjectData InvsLocationDetailAssocDeleteInIn) {
    InvsLocationDetailAssocDeleteIn = InvsLocationDetailAssocDeleteInIn;
  }

  public void translateFromMap() {
    InvsLocationDetailAssocDeleteIn = InvsLocationDetailAssocObjectHelper.fromMap(inputMap, "InvsLocationDetailAssoc");
  }

/**
 *
 * Gets the InvsLocationDetailAssoc
 * @return Value of the InvsLocationDetailAssoc
 *
 */

  public InvsLocationDetailAssocObjectData getInvsLocationDetailAssoc( ) {
    return InvsLocationDetailAssocDeleteIn;
  }

}
