/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeValidateCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeValidateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeValidateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsTypeValidateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeValidateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectData noOpInIn) {
    super(id, context, "InvsTypeValidateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsTypeValidate", InvsTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypeValidate").get("InvsTypeValidate"));
    }
  }
/**
 *
 * Sets the  InvsTypeValidate
 * @param noOpInIn InvsTypeObjectData to set
 *
 */
  public void setInvsTypeValidate(InvsTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypeValidate passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectData getInvsTypeValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeObjectHelper.fromMap(inputMap, "InvsTypeValidate");
  }
}
