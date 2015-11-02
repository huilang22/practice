/*
 * Generated code DO NOT EDIT
 * Generated file: DescriptionCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DescriptionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DescriptionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DescriptionObjectData noOpIn;

/**
 *
 * Constructor to create a   DescriptionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DescriptionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectData noOpInIn) {
    super(id, context, "DescriptionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Description", DescriptionObjectHelper.toMap(noOpIn, new HashMap(), "Description").get("Description"));
    }
  }
/**
 *
 * Sets the  Description
 * @param noOpInIn DescriptionObjectData to set
 *
 */
  public void setDescription(DescriptionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Description passed into the constructor
 * @return Simulated response
 *
 */
  public DescriptionObjectData getDescription() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DescriptionObjectHelper.fromMap(inputMap, "Description");
  }
}
