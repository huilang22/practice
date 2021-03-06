/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsFieldMasterCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsFieldMasterCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsFieldMasterObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsFieldMasterCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsFieldMasterCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectData noOpInIn) {
    super(id, context, "InvsFieldMasterCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(noOpIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
/**
 *
 * Sets the  InvsFieldMaster
 * @param noOpInIn InvsFieldMasterObjectData to set
 *
 */
  public void setInvsFieldMaster(InvsFieldMasterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsFieldMaster passed into the constructor
 * @return Simulated response
 *
 */
  public InvsFieldMasterObjectData getInvsFieldMaster() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsFieldMasterObjectHelper.fromMap(inputMap, "InvsFieldMaster");
  }
}
