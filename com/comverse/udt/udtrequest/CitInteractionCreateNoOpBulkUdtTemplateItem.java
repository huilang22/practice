/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitInteractionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitInteractionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitInteractionObjectData noOpIn;

/**
 *
 * Constructor to create a   CitInteractionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitInteractionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectData noOpInIn) {
    super(id, context, "CitInteractionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(noOpIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
/**
 *
 * Sets the  CitInteraction
 * @param noOpInIn CitInteractionObjectData to set
 *
 */
  public void setCitInteraction(CitInteractionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitInteraction passed into the constructor
 * @return Simulated response
 *
 */
  public CitInteractionObjectData getCitInteraction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitInteractionObjectHelper.fromMap(inputMap, "CitInteraction");
  }
}
