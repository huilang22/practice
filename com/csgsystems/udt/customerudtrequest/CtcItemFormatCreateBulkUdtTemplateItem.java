/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFormatCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemFormatCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemFormatCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemFormatObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcItemFormatCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemFormatCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectData CreateInIn) {
    super(id, context, "CtcItemFormatCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }


/**
 *
 * Sets the CtcItemFormat
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcItemFormat(CtcItemFormatObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcItemFormatObjectHelper.fromMap(inputMap, "CtcItemFormat");
  }

/**
 *
 * Gets the CtcItemFormat
 * @return Value of the CtcItemFormat
 *
 */

  public CtcItemFormatObjectData getCtcItemFormat( ) {
    return CreateIn;
  }

}
