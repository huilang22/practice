/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatTypeCreateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcFormatTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatTypeObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcFormatTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectData CreateInIn) {
    super(id, context, "CtcFormatTypeCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }


/**
 *
 * Sets the CtcFormatType
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcFormatType(CtcFormatTypeObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcFormatTypeObjectHelper.fromMap(inputMap, "CtcFormatType");
  }

/**
 *
 * Gets the CtcFormatType
 * @return Value of the CtcFormatType
 *
 */

  public CtcFormatTypeObjectData getCtcFormatType( ) {
    return CreateIn;
  }

}
