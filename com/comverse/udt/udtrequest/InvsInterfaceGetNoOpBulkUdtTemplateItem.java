/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsInterfaceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsInterfaceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsInterfaceObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsInterfaceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsInterfaceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectData noOpInIn) {
    super(id, context, "InvsInterfaceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(noOpIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }
/**
 *
 * Sets the  InvsInterface
 * @param noOpInIn InvsInterfaceObjectData to set
 *
 */
  public void setInvsInterface(InvsInterfaceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsInterface passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceObjectData getInvsInterface() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsInterfaceObjectHelper.fromMap(inputMap, "InvsInterface");
  }
}
