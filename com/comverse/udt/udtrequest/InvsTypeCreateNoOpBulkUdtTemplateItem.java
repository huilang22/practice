/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectData noOpInIn) {
    super(id, context, "InvsTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsType", InvsTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }
/**
 *
 * Sets the  InvsType
 * @param noOpInIn InvsTypeObjectData to set
 *
 */
  public void setInvsType(InvsTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectData getInvsType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeObjectHelper.fromMap(inputMap, "InvsType");
  }
}
