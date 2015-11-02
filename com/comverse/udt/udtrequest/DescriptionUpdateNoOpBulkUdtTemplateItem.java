/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DescriptionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DescriptionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DescriptionObjectData noOpIn;

/**
 *
 * Constructor to create a   DescriptionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DescriptionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectData noOpInIn) {
    super(id, context, "DescriptionUpdate");
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
