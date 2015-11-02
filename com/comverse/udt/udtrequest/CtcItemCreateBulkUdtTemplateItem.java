/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcItemCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectData CreateInIn) {
    super(id, context, "CtcItemCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcItem", CtcItemObjectHelper.toMap(CreateIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }


/**
 *
 * Sets the CtcItem
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcItem(CtcItemObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcItemObjectHelper.fromMap(inputMap, "CtcItem");
  }

/**
 *
 * Gets the CtcItem
 * @return Value of the CtcItem
 *
 */

  public CtcItemObjectData getCtcItem( ) {
    return CreateIn;
  }

}
