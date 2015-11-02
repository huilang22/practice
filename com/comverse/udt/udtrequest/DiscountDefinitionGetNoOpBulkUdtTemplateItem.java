/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountDefinitionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountDefinitionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DiscountDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountDefinitionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountDefinitionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectData noOpInIn) {
    super(id, context, "DiscountDefinitionGet");
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
