/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdConstraintDescriptionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintDescriptionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintDescriptionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintDescriptionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintDescriptionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectData noOpInIn) {
    super(id, context, "BsdConstraintDescriptionDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(noOpIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
/**
 *
 * Sets the  BsdConstraintDescription
 * @param noOpInIn BsdConstraintDescriptionObjectData to set
 *
 */
  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintDescription passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintDescriptionObjectData getBsdConstraintDescription() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintDescriptionObjectHelper.fromMap(inputMap, "BsdConstraintDescription");
  }
}
