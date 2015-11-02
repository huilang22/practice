/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLocationDetailAssocCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationDetailAssocCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationDetailAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationDetailAssocCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationDetailAssocCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailAssocObjectData noOpInIn) {
    super(id, context, "InvsLocationDetailAssocCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
/**
 *
 * Sets the  InvsLocationDetailAssoc
 * @param noOpInIn InvsLocationDetailAssocObjectData to set
 *
 */
  public void setInvsLocationDetailAssoc(InvsLocationDetailAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationDetailAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailAssocObjectData getInvsLocationDetailAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationDetailAssocObjectHelper.fromMap(inputMap, "InvsLocationDetailAssoc");
  }
}
