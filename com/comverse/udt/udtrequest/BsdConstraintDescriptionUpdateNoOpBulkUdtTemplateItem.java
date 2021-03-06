/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdConstraintDescriptionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintDescriptionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintDescriptionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintDescriptionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintDescriptionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectData noOpInIn) {
    super(id, context, "BsdConstraintDescriptionUpdate");
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
