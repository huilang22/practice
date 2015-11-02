/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationDetailAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailAssocObjectData InvsLocationDetailAssocCreateIn;
/**
 *
 * Constructor to create a  InvsLocationDetailAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailAssocObjectData InvsLocationDetailAssocCreateInIn) {
    super(id, context, "InvsLocationDetailAssocCreate");
    InvsLocationDetailAssocCreateIn = InvsLocationDetailAssocCreateInIn;
  }

  public void translateToMap() {
    if (InvsLocationDetailAssocCreateIn != null) {
      InvsLocationDetailAssocCreateIn.resetFlags(true, true);
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(InvsLocationDetailAssocCreateIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }


/**
 *
 * Sets the InvsLocationDetailAssoc
 * @param InvsLocationDetailAssocCreateInIn Value of the InvsLocationDetailAssocCreateIn
 *
 */

  public void setInvsLocationDetailAssoc(InvsLocationDetailAssocObjectData InvsLocationDetailAssocCreateInIn) {
    InvsLocationDetailAssocCreateIn = InvsLocationDetailAssocCreateInIn;
  }

  public void translateFromMap() {
    InvsLocationDetailAssocCreateIn = InvsLocationDetailAssocObjectHelper.fromMap(inputMap, "InvsLocationDetailAssoc");
  }

/**
 *
 * Gets the InvsLocationDetailAssoc
 * @return Value of the InvsLocationDetailAssoc
 *
 */

  public InvsLocationDetailAssocObjectData getInvsLocationDetailAssoc( ) {
    return InvsLocationDetailAssocCreateIn;
  }

}
