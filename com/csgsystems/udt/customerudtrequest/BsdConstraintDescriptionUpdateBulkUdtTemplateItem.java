/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintDescriptionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintDescriptionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintDescriptionObjectData bsdConstraintDescriptionUpdateIn;
/**
 *
 * Constructor to create a  BsdConstraintDescriptionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintDescriptionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectData bsdConstraintDescriptionUpdateInIn) {
    super(id, context, "BsdConstraintDescriptionUpdate");
    bsdConstraintDescriptionUpdateIn = bsdConstraintDescriptionUpdateInIn;
  }

  public void translateToMap() {
    if (bsdConstraintDescriptionUpdateIn != null) {
      bsdConstraintDescriptionUpdateIn.resetFlags(true, true);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(bsdConstraintDescriptionUpdateIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }


/**
 *
 * Sets the BsdConstraintDescription
 * @param bsdConstraintDescriptionUpdateInIn Value of the bsdConstraintDescriptionUpdateIn
 *
 */

  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectData bsdConstraintDescriptionUpdateInIn) {
    bsdConstraintDescriptionUpdateIn = bsdConstraintDescriptionUpdateInIn;
  }

  public void translateFromMap() {
    bsdConstraintDescriptionUpdateIn = BsdConstraintDescriptionObjectHelper.fromMap(inputMap, "BsdConstraintDescription");
  }

/**
 *
 * Gets the BsdConstraintDescription
 * @return Value of the BsdConstraintDescription
 *
 */

  public BsdConstraintDescriptionObjectData getBsdConstraintDescription( ) {
    return bsdConstraintDescriptionUpdateIn;
  }

}
