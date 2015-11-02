/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsContainerTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsContainerTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsContainerTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsContainerTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsContainerTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeObjectData noOpInIn) {
    super(id, context, "InvsContainerTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }
/**
 *
 * Sets the  InvsContainerType
 * @param noOpInIn InvsContainerTypeObjectData to set
 *
 */
  public void setInvsContainerType(InvsContainerTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsContainerType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeObjectData getInvsContainerType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsContainerTypeObjectHelper.fromMap(inputMap, "InvsContainerType");
  }
}
