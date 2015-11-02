/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsVendorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorObjectData InvsVendorCreateIn;
/**
 *
 * Constructor to create a  InvsVendorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectData InvsVendorCreateInIn) {
    super(id, context, "InvsVendorCreate");
    InvsVendorCreateIn = InvsVendorCreateInIn;
  }

  public void translateToMap() {
    if (InvsVendorCreateIn != null) {
      InvsVendorCreateIn.resetFlags(true, true);
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(InvsVendorCreateIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }


/**
 *
 * Sets the InvsVendor
 * @param InvsVendorCreateInIn Value of the InvsVendorCreateIn
 *
 */

  public void setInvsVendor(InvsVendorObjectData InvsVendorCreateInIn) {
    InvsVendorCreateIn = InvsVendorCreateInIn;
  }

  public void translateFromMap() {
    InvsVendorCreateIn = InvsVendorObjectHelper.fromMap(inputMap, "InvsVendor");
  }

/**
 *
 * Gets the InvsVendor
 * @return Value of the InvsVendor
 *
 */

  public InvsVendorObjectData getInvsVendor( ) {
    return InvsVendorCreateIn;
  }

}
