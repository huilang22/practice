/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementValidateSwapValidateBulkUdtTemplateItem.java
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
 * Class used to create a InvElementValidateSwapValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementValidateSwapValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementValidateObjectData InvElementValidateSwapValidateIn;
/**
 *
 * Constructor to create a  InvElementValidateSwapValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementValidateSwapValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementValidateObjectData InvElementValidateSwapValidateInIn) {
    super(id, context, "InvElementValidateSwapValidate");
    InvElementValidateSwapValidateIn = InvElementValidateSwapValidateInIn;
  }

  public void translateToMap() {
    if (InvElementValidateSwapValidateIn != null) {
      InvElementValidateSwapValidateIn.resetFlags(true, true);
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(InvElementValidateSwapValidateIn, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }


/**
 *
 * Sets the InvElementValidate
 * @param InvElementValidateSwapValidateInIn Value of the InvElementValidateSwapValidateIn
 *
 */

  public void setInvElementValidate(InvElementValidateObjectData InvElementValidateSwapValidateInIn) {
    InvElementValidateSwapValidateIn = InvElementValidateSwapValidateInIn;
  }

  public void translateFromMap() {
    InvElementValidateSwapValidateIn = InvElementValidateObjectHelper.fromMap(inputMap, "InvElementValidate");
  }

/**
 *
 * Gets the InvElementValidate
 * @return Value of the InvElementValidate
 *
 */

  public InvElementValidateObjectData getInvElementValidate( ) {
    return InvElementValidateSwapValidateIn;
  }

}
