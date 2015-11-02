/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationDetailUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationDetailUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationDetailUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationDetailUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectData noOpInIn) {
    super(id, context, "InvsLocationDetailUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
/**
 *
 * Sets the  InvsLocationDetail
 * @param noOpInIn InvsLocationDetailObjectData to set
 *
 */
  public void setInvsLocationDetail(InvsLocationDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationDetail passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailObjectData getInvsLocationDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationDetailObjectHelper.fromMap(inputMap, "InvsLocationDetail");
  }
}
