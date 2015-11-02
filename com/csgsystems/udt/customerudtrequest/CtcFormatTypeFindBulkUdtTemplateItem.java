/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatTypeObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcFormatTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectFilter FindInIn) {
    super(id, context, "CtcFormatTypeFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }


/**
 *
 * Sets the CtcFormatType
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcFormatType(CtcFormatTypeObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcFormatTypeObjectHelper.fromMapFilter(inputMap, "CtcFormatType");
  }

/**
 *
 * Gets the CtcFormatType
 * @return Value of the CtcFormatType
 *
 */

  public CtcFormatTypeObjectFilter getCtcFormatType( ) {
    return FindIn;
  }

}
