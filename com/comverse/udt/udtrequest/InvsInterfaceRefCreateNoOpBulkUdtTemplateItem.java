/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsInterfaceRefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsInterfaceRefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsInterfaceRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsInterfaceRefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsInterfaceRefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceRefObjectData noOpInIn) {
    super(id, context, "InvsInterfaceRefCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }
/**
 *
 * Sets the  InvsInterfaceRef
 * @param noOpInIn InvsInterfaceRefObjectData to set
 *
 */
  public void setInvsInterfaceRef(InvsInterfaceRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsInterfaceRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceRefObjectData getInvsInterfaceRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsInterfaceRefObjectHelper.fromMap(inputMap, "InvsInterfaceRef");
  }
}
