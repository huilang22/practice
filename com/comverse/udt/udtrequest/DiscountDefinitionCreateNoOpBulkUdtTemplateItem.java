/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountDefinitionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountDefinitionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DiscountDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountDefinitionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountDefinitionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectData noOpInIn) {
    super(id, context, "DiscountDefinitionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
/**
 *
 * Sets the  DiscountDefinition
 * @param noOpInIn DiscountDefinitionObjectData to set
 *
 */
  public void setDiscountDefinition(DiscountDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public DiscountDefinitionObjectData getDiscountDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DiscountDefinitionObjectHelper.fromMap(inputMap, "DiscountDefinition");
  }
}
