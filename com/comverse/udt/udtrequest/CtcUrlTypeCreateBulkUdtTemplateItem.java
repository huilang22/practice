/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcUrlTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcUrlTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcUrlTypeObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcUrlTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcUrlTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectData CreateInIn) {
    super(id, context, "CtcUrlTypeCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }


/**
 *
 * Sets the CtcUrlType
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcUrlType(CtcUrlTypeObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcUrlTypeObjectHelper.fromMap(inputMap, "CtcUrlType");
  }

/**
 *
 * Gets the CtcUrlType
 * @return Value of the CtcUrlType
 *
 */

  public CtcUrlTypeObjectData getCtcUrlType( ) {
    return CreateIn;
  }

}
