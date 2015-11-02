/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVendorGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVendorGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVendorObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsVendorGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVendorGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectData noOpInIn) {
    super(id, context, "InvsVendorGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(noOpIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
/**
 *
 * Sets the  InvsVendor
 * @param noOpInIn InvsVendorObjectData to set
 *
 */
  public void setInvsVendor(InvsVendorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVendor passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorObjectData getInvsVendor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVendorObjectHelper.fromMap(inputMap, "InvsVendor");
  }
}
