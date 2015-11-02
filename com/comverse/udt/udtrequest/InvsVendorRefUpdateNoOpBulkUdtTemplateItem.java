/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVendorRefUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVendorRefUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVendorRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsVendorRefUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVendorRefUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectData noOpInIn) {
    super(id, context, "InvsVendorRefUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
/**
 *
 * Sets the  InvsVendorRef
 * @param noOpInIn InvsVendorRefObjectData to set
 *
 */
  public void setInvsVendorRef(InvsVendorRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVendorRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorRefObjectData getInvsVendorRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVendorRefObjectHelper.fromMap(inputMap, "InvsVendorRef");
  }
}
