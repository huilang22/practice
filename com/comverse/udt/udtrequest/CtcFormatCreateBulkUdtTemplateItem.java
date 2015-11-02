/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatCreateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcFormatCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcFormatCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectData CreateInIn) {
    super(id, context, "CtcFormatCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(CreateIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }


/**
 *
 * Sets the CtcFormat
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcFormat(CtcFormatObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcFormatObjectHelper.fromMap(inputMap, "CtcFormat");
  }

/**
 *
 * Gets the CtcFormat
 * @return Value of the CtcFormat
 *
 */

  public CtcFormatObjectData getCtcFormat( ) {
    return CreateIn;
  }

}
