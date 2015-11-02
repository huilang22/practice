/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementValidateSwapValidateNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvElementValidateSwapValidateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementValidateSwapValidateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementValidateObjectData noOpIn;

/**
 *
 * Constructor to create a   InvElementValidateSwapValidateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementValidateSwapValidateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementValidateObjectData noOpInIn) {
    super(id, context, "InvElementValidateSwapValidate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(noOpIn, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }
/**
 *
 * Sets the  InvElementValidate
 * @param noOpInIn InvElementValidateObjectData to set
 *
 */
  public void setInvElementValidate(InvElementValidateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElementValidate passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementValidateObjectData getInvElementValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementValidateObjectHelper.fromMap(inputMap, "InvElementValidate");
  }
}
