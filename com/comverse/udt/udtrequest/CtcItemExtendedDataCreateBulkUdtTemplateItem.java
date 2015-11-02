/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemExtendedDataCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemExtendedDataCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemExtendedDataObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcItemExtendedDataCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemExtendedDataCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectData CreateInIn) {
    super(id, context, "CtcItemExtendedDataCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }


/**
 *
 * Sets the CtcItemExtendedData
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcItemExtendedData(CtcItemExtendedDataObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcItemExtendedDataObjectHelper.fromMap(inputMap, "CtcItemExtendedData");
  }

/**
 *
 * Gets the CtcItemExtendedData
 * @return Value of the CtcItemExtendedData
 *
 */

  public CtcItemExtendedDataObjectData getCtcItemExtendedData( ) {
    return CreateIn;
  }

}
